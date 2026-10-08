import ghidra.app.decompiler.*;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressSet;
import ghidra.program.model.data.PointerDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.*;
import java.io.*;
import java.util.*;

public class PhotoSphereSweep extends GhidraScript {
    private static final Map<String,long[]> FOCUS=new LinkedHashMap<>();
    static {
        FOCUS.put("rosette", new long[]{
            0x004440ecL,0x00443e74L,0x004f19f4L,0x004f40fcL,
            0x0021b5f4L,0x0021be38L,0x0021976cL,0x0021e3e4L
        });
        FOCUS.put("seams", new long[]{
            0x00433478L,0x0042114cL,0x00423f2cL,0x00420998L,
            0x00421718L,0x00421c80L,0x004390a8L,0x00439600L
        });
        FOCUS.put("flow-line", new long[]{
            0x001ed84cL,0x001f40f0L,0x001ffc30L,0x001fff14L,
            0x00406504L,0x00406fccL,0x00416a40L,0x00416a64L,
            0x00403cf8L,0x002287c0L
        });
        FOCUS.put("targets-meta", new long[]{
            0x002159fcL,0x002147c4L,0x0021105cL,0x001efb78L,
            0x0020f448L,0x0020f6a0L,0x00419b74L,0x001ed94cL
        });
        FOCUS.put("rosette-access", new long[]{
            0x004440ecL,0x00443e74L,0x0041a6bcL,0x00447c9cL,
            0x00447884L,0x00447bd4L,0x0021b18cL,0x0021b5f4L,
            0x0041ce34L,0x004478b8L,0x0041a2fcL,0x0041b400L
        });
        FOCUS.put("seam-finish", new long[]{
            0x00433478L,0x004390a8L,0x00439600L,0x0042114cL,
            0x00421c80L,0x00421fb0L,0x0042a24cL,0x0042a3d8L,
            0x00423310L,0x00423bc4L,0x00423f2cL,0x00422208L,
            0x0042278cL,0x0042a4fcL,0x0042a6a4L,0x0049c2bcL,
            0x0043901cL,0x00438fecL
        });
        FOCUS.put("flow-config", new long[]{
            0x001f214cL,0x001f327cL,0x001f32b0L,0x001f32bcL,
            0x001f333cL,0x001f40f0L,0x001ffc30L,0x001fff14L,
            0x001f4010L,0x001f2e54L,0x001f5fb0L,0x001f27d8L
        });
        FOCUS.put("target-config", new long[]{
            0x001edb8cL,0x001ed84cL,0x001efb78L,0x001ef8f8L,
            0x002159fcL,0x002147c4L,0x002158fcL,0x0020f6a0L,
            0x0020f448L,0x00216948L,0x00419d40L,0x00419b74L,
            0x0041aa40L,0x0041a6bcL
        });
        FOCUS.put("blend-vtable", new long[]{
            0x0043e930L,0x00423310L,0x00433478L,0x004252b0L,
            0x0042a6a4L,0x0042b114L,0x00423f2cL,0x00421fb0L,
            0x004380dcL,0x0043e870L,0x0043e990L,0x0043eda4L,0x00216f7cL,0x004482f0L,0x004488d8L,0x00448048L,0x0044b2ecL,0x004f19f4L
        });
        FOCUS.put("blend-pixel", new long[]{
            0x0043e930L,0x00423310L,0x004252b0L,0x00425770L,
            0x004121bcL,0x0042368cL,0x0042a4fcL,0x0042a6a4L,
            0x0042b114L,0x0042ad24L,0x0042114cL,0x00421fb0L,
            0x0041fb10L,0x004350ecL,0x00433478L
        });
        FOCUS.put("source-index", new long[]{
            0x0041a6bcL,0x00443e74L,0x004440ecL,0x00447c9cL,
            0x00447bd4L,0x00447a54L,0x004405c8L,0x0041b04cL,
            0x0041a84cL,0x0041a9a8L,0x00419d40L,0x00450c1cL,
            0x00450c9cL,0x001f002cL,0x0021b5f4L
        });
        FOCUS.put("target-provenance", new long[]{
            0x001edb8cL,0x001ed84cL,0x001efb78L,0x002158fcL,
            0x002159fcL,0x002147c4L,0x0020f6a0L,0x0021105cL,
            0x002188b8L,0x0021874cL,0x002189d8L,0x0020f448L,
            0x0020f9e4L,0x0020fc30L,0x0020fa04L,0x001ef8f8L
        });
        FOCUS.put("blend-final", new long[]{
            0x0043ea50L,0x0043e930L,0x0043e970L,0x0043e9e0L,
            0x00423310L,0x0043eda4L,0x0043ed00L,0x0043ec00L,0x0043ef00L,
            0x0043f4a4L,0x0042a6a4L,0x004252b0L,0x00425770L
        });
        FOCUS.put("projection-model", new long[]{
            0x002189d8L,0x004305bcL,0x0041b154L,0x00431344L,
            0x00430978L,0x0021874cL,0x0041c5e0L,0x002188b8L,
            0x002158fcL,0x00440560L
        });
        FOCUS.put("pixel-sampler", new long[]{
            0x00216f7cL,0x0021771cL,0x0043eda4L,0x0043ea50L,
            0x00216e20L,0x00216cf0L,0x00217120L,0x00217320L,
            0x004121bcL,0x00425770L
        });
        FOCUS.put("camera-calibration", new long[]{
            0x00431118L,0x00431344L,0x00430978L,0x004305bcL,
            0x0041b154L,0x004309e4L,0x00430e14L,0x00431690L,
            0x00430560L,0x00431368L
        });
        FOCUS.put("mapper-callback", new long[]{
            0x0043e930L,0x0043ea50L,0x00423310L,0x00433478L,
            0x0043eda4L,0x0043e970L,0x0043e9e0L,0x0043e114L,
            0x004380dcL,0x0043e800L
        });
        FOCUS.put("fov-final", new long[]{
            0x00431954L,0x00431118L,0x00431344L,0x004305bcL,
            0x00430978L,0x002189d8L,0x002158fcL,0x0041c5e0L
        });
        FOCUS.put("seam-cut", new long[]{
            0x00433478L,0x004380dcL,0x00437958L,0x00437860L,
            0x00438fecL,0x00438fccL,0x0043901cL,0x004390a8L,
            0x00439600L,0x00438468L,0x0043605cL,0x00435eb0L,
            0x00435f6cL,0x00437ab8L,0x00437e68L,0x004382d0L,
            0x004326a8L,0x00435000L,0x004331d0L
        });
        FOCUS.put("blend-weights", new long[]{
            0x00421c80L,0x0042114cL,0x00421fb0L,0x00423f2cL,
            0x0042278cL,0x00422208L,0x0042a6a4L,0x0042a4fcL,
            0x0042b114L,0x0042ad24L,0x0042a474L,0x0042a3f0L,
            0x00425c40L,0x004286e0L,0x00428800L,0x00421e6cL,
            0x00421718L,0x00421908L,0x00421c74L
        });
        FOCUS.put("source-mapping", new long[]{
            0x00423310L,0x00433478L,0x0043e930L,0x0043ea50L,
            0x0043eda4L,0x0043e114L,0x004380dcL,0x004405c8L,
            0x00421fb0L,0x0042114cL,0x00431a24L,0x00431344L,
            0x00430e14L,0x00431690L,0x0041a6bcL
        });
        FOCUS.put("mask-generator", new long[]{
            0x0049c5d8L,0x004380dcL,0x00433478L,
            0x00437958L,0x004390a8L,0x00439600L,
            0x0049c604L,0x0049c654L
        });
        FOCUS.put("warp-threads", new long[]{
            0x0043ea50L,0x0043eda4L,0x004482f0L,0x004488d8L,
            0x0044834cL,0x0043e930L,0x0043f4a4L,0x0043f4f4L,
            0x0043f544L,0x004488c8L,0x004488d0L,0x004488d8L,
            0x0044b2ecL,0x00448048L,0x00423f2cL,0x00433478L
        });
        FOCUS.put("rle-receiver", new long[]{
            0x0049c5d8L,0x0049ce64L,0x0049c2bcL,0x004380dcL,
            0x0049c8e0L,0x0049c9b0L,0x0049cb08L,0x0049cc00L,
            0x0049cd00L,0x0049ce00L,0x0049cf20L,0x0049d000L,
            0x00437860L,0x00437958L,0x00437ab8L,0x00437e68L
        });
        FOCUS.put("graphcut-solver", new long[]{
            0x004390a8L,0x00439600L,0x0043901cL,0x00438fecL,
            0x00438fccL,0x004397b0L,0x00439a6cL,0x00439abcL,
            0x00439b0cL,0x00433478L,0x00437e68L,0x00438468L,
            0x00435f6cL,0x00435eb0L,0x004380dcL,0x0049c2bcL
        });
        FOCUS.put("blend-accumulator", new long[]{
            0x004208c0L,0x00420998L,0x00421c80L,0x00421e6cL,
            0x00421efcL,0x00423f2cL,0x0042a6a4L,0x0042a4fcL,
            0x004286e0L,0x00428800L,0x00422208L,0x0042278cL,
            0x004297ecL,0x0042ad24L,0x00421718L,0x0042368cL
        });
        FOCUS.put("source-camera-vtables", new long[]{
            0x004405c8L,0x0043d52cL,0x0043d6f8L,0x0043e2e4L,
            0x0043e524L,0x0043df98L,0x0043e53cL,0x0043e5a4L,
            0x0043f4a4L,0x0043f4f4L,0x0043f544L,0x00423310L,
            0x00433478L,0x0041a6bcL,0x00421fb0L
        });
        FOCUS.put("thread-join-detail", new long[]{
            0x0044b6b0L,0x00448048L,0x00448978L,0x0044e5e8L,
            0x0044b2ecL,0x004482f0L,0x004488d8L,0x0044834cL,
            0x0043f3c8L,0x0043f3acL,0x0043eda4L,0x0043ea50L
        });
        FOCUS.put("seam-rle-methods", new long[]{
            0x0049c5d8L,0x0049ce64L,0x0049ca90L,0x004380dcL,
            0x0049d07cL,0x0049c604L,0x0049c7a0L,0x0049d108L
        });
        FOCUS.put("graphcut-decision", new long[]{
            0x0043ad54L,0x00439b0cL,0x004390a8L,0x00439600L,
            0x0043aa50L,0x0043a7c0L,0x0043ac00L,0x0043ac78L,
            0x0043ae00L,0x0043af80L,0x0043b000L,0x0043b330L,
            0x0049ca90L,0x0049ce64L,0x0043ad20L
        });
        FOCUS.put("seam-success-helpers", new long[]{
            0x0043ad54L,0x0043bcd8L,0x0043bd4cL,0x0043bd68L,
            0x0043bd94L,0x004080c4L,0x00439b0cL,0x00439a6cL,
            0x00439abcL,0x00439838L,0x00439c00L,0x0043c6c0L,
            0x0043cad0L,0x0043df98L,0x0043dc58L,0x0049d170L
        });
        FOCUS.put("ibfs-label-output", new long[]{
            0x0043df98L,0x0043dc58L,0x0043c6c0L,0x0043cad0L,
            0x0043d33cL,0x0043bcd8L,0x0043bd4cL,0x0043bd68L,
            0x0043bd94L,0x0043ad54L,0x0043c104L,0x0043d1a4L,
            0x0043e53cL,0x0043e5a4L,0x00439b0cL
        });
        FOCUS.put("blend-normalization-helpers", new long[]{
            0x00423f2cL,0x0042368cL,0x00423bc4L,0x0042a6a4L,
            0x0042ad24L,0x004286e0L,0x00428800L,0x0042278cL,
            0x0042cd58L,0x00422ffcL,0x00421718L,0x00421fb0L,
            0x0042114cL,0x0042b114L,0x0042a474L
        });
        FOCUS.put("graph-interface", new long[]{
            0x0043bd94L,0x0043bef0L,0x0043bcd8L,0x0043bd4cL,
            0x0043bd68L,0x0043d52cL,0x0043d6f8L,0x0043df98L,
            0x0043e53cL,0x0043e5a4L,0x0043dc58L,0x0043c6c0L,
            0x0043c104L,0x0043a568L,0x0043ad54L
        });
        FOCUS.put("blend-coefficient", new long[]{
            0x00423f2cL,0x00424f14L,0x00424c68L,0x00424d08L,
            0x00424f50L,0x00425770L,0x0042a6a4L,0x0042ad24L,
            0x0049b77cL,0x00421718L,0x004208c0L,0x00421c80L,
            0x00421908L,0x00421798L,0x0042b114L
        });
        FOCUS.put("ibfs-partition-writers", new long[]{
            0x0043dc58L,0x0043df98L,0x0043c160L,0x0043e5a4L,
            0x0043d33cL,0x0043c6c0L,0x0043cad0L,0x0043e53cL,
            0x0043bd94L,0x0043bef0L,0x0043bd4cL
        });
        FOCUS.put("blend-final-pixels", new long[]{
            0x0042169cL,0x00421718L,0x00421798L,0x00421908L,
            0x00420decL,0x00420e0cL,0x00420f2cL,0x00421efcL,
            0x00421e6cL,0x0042114cL,0x00421fb0L,0x00423f2cL
        });
        FOCUS.put("source-provenance-caller", new long[]{
            0x0042114cL,0x00421fb0L,0x00423310L,0x00433478L,
            0x0043e930L,0x0043ea50L,0x0043eda4L,
            0x0043e114L,0x0041c618L,0x0041a0e8L
        });
        FOCUS.put("blend-pyramid-collapse", new long[]{
            0x0042169cL,0x0042b348L,0x0042cb18L,0x00422ffcL,
            0x0042a6a4L,0x00423f2cL,0x00421efcL,0x00421718L,
            0x0042ad24L,0x0042a474L,0x0042b114L,0x0042cd58L
        });
        FOCUS.put("blend-reconstruction-kernels", new long[]{
            0x0042bf50L,0x0042b438L,0x0042cc34L,0x00425c40L,
            0x0042b348L,0x0042cb18L,0x0042ad24L,0x0042b114L,
            0x0042b610L,0x0042b750L,0x0042c178L,0x0042ca00L
        });
        FOCUS.put("mask-pyramid-assembly", new long[]{
            0x004297ecL,0x0042a4fcL,0x0042a6a4L,0x0042b114L,
            0x004286e0L,0x00428800L,0x0042ad24L,0x00423bc4L,
            0x00423f2cL,0x00421718L,0x0042368cL
        });
        FOCUS.put("render-source-object", new long[]{
            0x0041c618L,0x0041a0e8L,0x0041a6bcL,0x00433478L,
            0x00423310L,0x0042114cL,0x00421fb0L,0x0043e930L,
            0x0043ea50L,0x0043eda4L,0x004405c8L
        });
        FOCUS.put("mask-pyramid-pixel", new long[]{
            0x0042a6a4L,0x0049b77cL,0x004121bcL,0x0042ad24L,
            0x0042b114L,0x0042826cL,0x0042a408L,0x0042a474L,
            0x0042a4fcL,0x004297ecL
        });
        FOCUS.put("renderer-mapper-factory", new long[]{
            0x0041cc5cL,0x0043f3e0L,0x00431d28L,0x00431cbcL,
            0x00433294L,0x0041f140L,0x0041f118L,
            0x00441dc0L,0x0049a19cL,0x0041c618L
        });
        FOCUS.put("concrete-camera-callback", new long[]{
            0x0043f544L,0x0043f600L,0x0043f678L,0x0043f860L,
            0x0043f8a8L,0x0043f8e8L,0x0043f93cL,0x0043f94cL,
            0x0043fa48L,0x0043fa58L,0x0043f3e0L
        });
        FOCUS.put("binary-mask-producer", new long[]{
            0x0042a4fcL,0x004297ecL,0x0042a6a4L,0x0049b77cL,
            0x0043ad54L,0x0049ca90L,0x0049ce64L,
            0x00420e0cL,0x00421efcL,0x00420f2cL
        });
        FOCUS.put("composite-renderer-methods", new long[]{
            0x0041d0ccL,0x0041d150L,0x0041d330L,0x0041d3bcL,
            0x0041d00cL,0x0041d0b4L,0x0041cc5cL,
            0x00433294L,0x0043f3e0L
        });
        FOCUS.put("mask-unit-conversion", new long[]{
            0x0042d224L,0x0042a4fcL,0x0042d3d8L,0x0042da60L,
            0x004269acL,0x004297ecL,0x0042a6a4L,
            0x0049b77cL,0x0042ad24L
        });
        FOCUS.put("rosette-camera-projection", new long[]{
            0x0043f544L,0x0043f600L,0x0043f678L,
            0x004405c8L,0x004440ecL,0x0041a6bcL,
            0x0043f3e0L,0x0043ea50L,0x0043eda4L
        });
        FOCUS.put("rosette-vtable-geometry", new long[]{
            0x00443e74L,0x004440ecL,0x0041a6bcL,0x0041d3dcL,
            0x0043f544L,0x0043f600L,0x0043f678L,
            0x0043faccL,0x004405c8L,0x0043f3e0L
        });
        FOCUS.put("mask-rle-stitcher-bridge", new long[]{
            0x0043ad54L,0x0049ca90L,0x0049ce64L,
            0x0041d3dcL,0x0041e8acL,0x0042114cL,0x00421fb0L,
            0x00437958L,0x00437ab8L,0x00437e68L,0x004380dcL
        });
        FOCUS.put("mask-level-threshold", new long[]{
            0x00420e0cL,0x00421efcL,0x00421fb0L,
            0x0042114cL,0x0042169cL,0x0042a6a4L,0x0042a4fcL,
            0x004297ecL,0x00420decL,0x0041d3dcL
        });
        FOCUS.put("rosette-forward-reverse", new long[]{
            0x00445514L,0x0044565cL,0x004454ecL,0x0044550cL,
            0x004450dcL,0x004453c4L,0x00445798L,0x0044587cL,
            0x00443e74L,0x0043f544L,0x0043f600L
        });
        FOCUS.put("mask-rle-consumer", new long[]{
            0x0049ca90L,0x0049ce64L,0x004380dcL,
            0x0041df08L,0x0041d3dcL,0x0041e8acL,
            0x0041ce34L,0x0049c5d8L,0x00437ab8L
        });
        FOCUS.put("feather-mode-origin", new long[]{
            0x00420decL,0x00420e0cL,0x00420f2cL,
            0x004208c0L,0x0042114cL,0x00421fb0L,
            0x0041d3dcL,0x0041e8acL,0x0042a6a4L
        });
        FOCUS.put("rle-fill-value-to-blender", new long[]{
            0x0041fb10L,0x0049ce64L,0x0049ca90L,0x0041e8acL,
            0x0042114cL,0x00421fb0L,0x0042368cL,
            0x004380dcL,0x0049c5d8L,0x0042a6a4L
        });
        FOCUS.put("camera-projection-constructors", new long[]{
            0x00431344L,0x00430978L,0x004305bcL,0x00431118L,
            0x00431d48L,0x00431cbcL,0x00431d28L,0x00430560L,
            0x00430e14L,0x00431690L
        });
        FOCUS.put("mosaic-coordinate-model", new long[]{
            0x0041c618L,0x0043f3e0L,0x0043f544L,0x0043f600L,
            0x00445798L,0x0044587cL,0x00431cbcL,0x00431d28L,
            0x00431344L,0x00433294L,0x0041cc5cL
        });
        FOCUS.put("seam-rle-blend-adapter", new long[]{
            0x0043ad54L,0x004380dcL,0x00437ab8L,0x00437e68L,
            0x0049c5d8L,0x0049ca90L,0x0049ce64L,
            0x0041e8acL,0x0042114cL,0x00421fb0L,
            0x0041fb10L
        });
        FOCUS.put("camera-concrete-pixel-project", new long[]{
            0x00430c24L,0x00430ddcL,0x00430a8cL,
            0x00430b40L,0x00431030L,0x00430d54L,
            0x00430978L,0x00431954L
        });
        FOCUS.put("camera-base-linear-projection", new long[]{
            0x00431b54L,0x00431c38L,0x00431690L,
            0x004317bcL,0x00431a24L,0x00431118L,
            0x00431344L,0x00431ae8L
        });
        FOCUS.put("camera-distortion-internals", new long[]{
            0x00431954L,0x00431690L,0x004317bcL,0x00431a24L,
            0x00430b40L,0x00430a8cL,0x00430668L,
            0x00431b54L,0x00431c38L
        });
        FOCUS.put("seam-projection-mask-bridge", new long[]{
            0x004364fcL,0x004380dcL,0x00437e68L,
            0x0049ce64L,0x0049ca90L,0x0043ad54L,
            0x0042a6a4L,0x0042114cL,0x00421fb0L
        });
        FOCUS.put("render-object-constructors", new long[]{
            0x00431cbcL,0x00431d28L,0x0041c618L,0x0041cc5cL,
            0x00433294L,0x0041f118L,0x0041f140L,0x0043f3e0L,
            0x00431344L,0x00430978L
        });
        FOCUS.put("mosaic-model-dispatch", new long[]{
            0x00431344L,0x00430978L,0x00431118L,0x00431954L,
            0x00431a24L,0x00430e14L,0x00431d28L,0x00431cbcL,
            0x0041c618L,0x0043f544L,0x0043f600L
        });
        FOCUS.put("mask-projection-fill", new long[]{
            0x004364fcL,0x004380dcL,0x00437e68L,
            0x0043ad54L,0x0049ca90L,0x0049ce64L,
            0x00421c80L,0x00421e6cL,0x0041e8acL,
            0x00423310L,0x0042d224L,0x0042a4fcL
        });
        FOCUS.put("equirectangular-model", new long[]{
            0x00430800L,0x004308c0L,0x00430668L,0x0043070cL,
            0x004305d0L,0x00430604L,0x004305bcL,0x0041b154L,
            0x002189d8L
        });
        FOCUS.put("output-mosaic-factory", new long[]{
            0x002189d8L,0x004305bcL,0x0041b154L,0x00431344L,
            0x00430978L,0x00431b54L,0x00431c38L,
            0x00430800L,0x004308c0L,0x0041c618L
        });
        FOCUS.put("mosaic-ray-adapters", new long[]{
            0x0043f544L,0x0043f600L,0x00430800L,0x004308c0L,
            0x0041b154L,0x0043f3e0L,0x00445798L,0x0044587cL,
            0x0041b400L,0x004305bcL
        });
        FOCUS.put("input-lens-distortion-75", new long[]{
            0x00431b54L,0x00431c38L,0x00431690L,0x004317bcL,
            0x00430a8cL,0x00430b40L,0x00431030L,0x00431344L,
            0x00441dc0L,0x0041a6bcL,0x004440ecL
        });
        FOCUS.put("mask-rle-final-consumer-75", new long[]{
            0x0042114cL,0x00421fb0L,0x00423310L,0x0042368cL,
            0x0041fb10L,0x00423f2cL,0x0042a6a4L,
            0x0049ce64L,0x0049ca90L,0x0041d3dcL
        });
        FOCUS.put("capture-camera-provenance-75", new long[]{
            0x0041a6bcL,0x004440ecL,0x00443e74L,
            0x00431344L,0x00430978L,0x004305bcL,
            0x0041c618L,0x0043f3e0L,0x0041b400L,
            0x004405c8L,0x0041a0e8L
        });
        FOCUS.put("fisheye-projection-exact-76", new long[]{
            0x00430ec4L,0x00431030L,0x00430c24L,0x00430ddcL,
            0x00430978L,0x00430b40L,0x00430a8cL,0x00431b54L
        });
        FOCUS.put("rle-fill-calls-77", new long[]{
            0x0043605cL,0x00437300L,0x00437600L,
            0x0043b7fcL,0x0041e1c8L,0x00437ab8L,
            0x00437e68L,0x004380dcL,0x0043ad54L
        });
        FOCUS.put("rle-blender-mask-entry-77", new long[]{
            0x0043605cL,0x004360b0L,0x0041e1c8L,
            0x0043b7fcL,0x0041e8acL,0x0041c618L,
            0x0041d3dcL,0x0043ad54L,0x0049ce64L,
            0x004297ecL,0x0042a4fcL
        });
        FOCUS.put("blender-contrast-level-origin-77", new long[]{
            0x0041f118L,0x0041f140L,0x0041c618L,
            0x0041cc5cL,0x0041d3dcL,0x0042114cL,
            0x00421fb0L,0x00420e0cL,0x0042a6a4L
        });
        FOCUS.put("unit-mask-to-stitcher-77", new long[]{
            0x00433478L,0x0043605cL,0x00437378L,
            0x00437498L,0x0043262cL,0x0043317cL,
            0x00431f20L,0x004331d0L,0x0041c618L
        });
        FOCUS.put("final-mask-third-class-79", new long[]{
            0x00434f20L,0x00433478L,0x00437378L,
            0x00437498L,0x004332fcL,0x0043454cL,
            0x0041e8acL,0x0041c618L,0x00433294L
        });
        FOCUS.put("source-lens-strings-79", new long[]{
            0x00431344L,0x00431b54L,0x00431c38L,
            0x0041a6bcL,0x004440ecL,0x00443e74L,
            0x00430ec4L,0x00431030L,0x00441dc0L
        });
        FOCUS.put("session-model-inspection-79", new long[]{
            0x0041a6bcL,0x004440ecL,0x00443e74L,
            0x0041c618L,0x00431f20L,0x0043f3e0L,
            0x00433478L,0x00434f20L,0x00431344L
        });
        FOCUS.put("fov-calibration-kernels-80", new long[]{
            0x001f0e48L,0x001f0fc8L,0x001f3848L,
            0x001f40f0L,0x001f0de4L,0x001f1400L,
            0x001f2800L,0x001f3a00L
        });
        FOCUS.put("camera-lens-session-80", new long[]{
            0x0041a6bcL,0x00443e74L,0x004440ecL,
            0x00431344L,0x00431118L,0x00431b54L,
            0x00431c38L,0x004405c8L,0x0044587cL
        });
        FOCUS.put("fov-solver-core-81", new long[]{
            0x001f1458L,0x001f213cL,0x001f1cd0L,
            0x001f1d48L,0x001f0fc8L,0x001f0e48L,
            0x00431344L,0x001f3a00L
        });
        FOCUS.put("fov-jni-callgraph-81", new long[]{
            0x001f0784L,0x001f1458L,0x001f0e48L,
            0x001f0fc8L,0x001f1450L,0x001f1cd0L,
            0x001f213cL,0x001f3848L,0x001f40f0L
        });
        FOCUS.put("fov-pair-registration-82", new long[]{
            0x001f1d48L,0x001f3d64L,0x001f40f0L,0x001ff1c8L,
            0x001f4eb0L,0x001f5040L,0x004441e0L,
            0x0021c284L,0x001f0fc8L,0x001f3848L
        });
        FOCUS.put("fov-feature-preprocess-82", new long[]{
            0x001f3848L,0x001f5564L,0x001f5710L,0x001f3bc0L,
            0x001f4eb0L,0x001f5040L,0x0021c284L,0x001f1d48L
        });
        FOCUS.put("fov-solver-state-82", new long[]{
            0x001f1344L,0x001f153cL,0x001f1638L,0x001f1764L,
            0x001f17b0L,0x001f0e48L,0x001f0fc8L,0x00225b08L,
            0x00225b00L,0x00225b20L
        });
        FOCUS.put("fov-flow-constraints-83", new long[]{
            0x001ff1c8L,0x001fefdcL,0x001ff6bcL,0x001f51c4L,
            0x001f5fb0L,0x001f5710L,0x001f5564L,
            0x001f3848L,0x001f40f0L
        });
        FOCUS.put("fov-pose-update-83", new long[]{
            0x001f40f0L,0x001f3e34L,0x001f2e54L,
            0x001f3c80L,0x001f3d64L,0x001f5fb0L,
            0x001f5040L,0x001f3848L
        });
        FOCUS.put("fov-session-input-83", new long[]{
            0x001f1d48L,0x0021c284L,0x004441e0L,
            0x001f0e48L,0x001f0fc8L,0x001f3c80L,
            0x00447b0cL,0x0041a6bcL
        });
        FOCUS.put("fov-flow-update-84", new long[]{
            0x001ffc30L,0x001ff1c8L,0x001fefdcL,
            0x001f40f0L,0x001f3e34L,0x001f2e54L,
            0x001f4eb0L,0x001f5040L,0x00431c38L,
            0x00431b54L
        });
        FOCUS.put("fov-flow-normal-equations-85", new long[]{
            0x001ffab0L,0x001fff14L,0x001fdf50L,
            0x001ffc30L,0x001fd76cL,0x001fefdcL,
            0x001ff1c8L,0x001f40f0L
        });
        FOCUS.put("fov-flow-jacobian-86", new long[]{
            0x001ff7dcL,0x001ffab0L,0x001fff14L,
            0x001fd76cL,0x001fdf50L,0x001ff1c8L,
            0x001fefdcL,0x001ffc30L
        });
        FOCUS.put("render-options-native-87", new long[]{
            0x0041c618L,0x0041f140L,0x0041f118L,0x0041d3dcL,
            0x00421fb0L,0x00423f2cL,0x0042a6a4L,0x00420decL,
            0x00420998L,0x0042a4fcL,0x0041df08L
        });
        FOCUS.put("session-metadata-native-87", new long[]{
            0x0021976cL,0x0021b5f4L,0x00419b74L,0x0041a6bcL,
            0x00447bd4L,0x00447b0cL,0x00447c9cL,0x00450c1cL,
            0x00450c9cL,0x0041d150L,0x0041e8acL,0x00421be38L
        });
        FOCUS.put("lens-correction-native-87", new long[]{
            0x00431b54L,0x00431c38L,0x00431344L,0x00431118L,
            0x00431690L,0x004317bcL,0x00430ec4L,0x00431030L,
            0x00430e14L,0x00430978L,0x004405c8L,0x00443e74L
        });
        FOCUS.put("session-writer-callers-88", new long[]{
            0x00419b74L,0x00419b00L,0x00419910L,0x00419cf0L,
            0x0021976cL,0x0021b5f4L,0x0041a6bcL,0x00447bd4L,
            0x00450c1cL,0x0041c618L
        });
        FOCUS.put("metadata-count-path-88", new long[]{
            0x0021976cL,0x0021b5f4L,0x00419b74L,0x00419cf0L,
            0x0041a6bcL,0x00443e74L,0x00447bd4L,
            0x00419f0cL,0x0041b154L
        });
        FOCUS.put("render-lens-defaults-88", new long[]{
            0x0041c618L,0x0041d3dcL,0x0041f140L,0x0041f118L,
            0x00431b54L,0x00431c38L,0x00431344L,
            0x00431690L,0x0042a6a4L,0x00423f2cL
        });
        FOCUS.put("session-storage-vtables-89", new long[]{
            0x0041aa40L,0x00419d40L,0x00419b74L,
            0x004478b8L,0x00447a54L,0x0041a988L,
            0x0041a9a8L,0x0041a84cL,0x0041ae0cL
        });
        FOCUS.put("storage-path-reset-89", new long[]{
            0x0041aa40L,0x0041aa8cL,0x0041a988L,
            0x0041a9a8L,0x0041a84cL,0x00419d40L,
            0x004478b8L,0x0041ae0cL,0x0041af30L
        });
        FOCUS.put("capture-metadata-writer-89", new long[]{
            0x00419b74L,0x00419d40L,0x0041a6bcL,
            0x0021b5f4L,0x0021976cL,0x0041c618L,
            0x0041d3dcL,0x0041aa40L
        });
        FOCUS.put("session-storage-ctor-90", new long[]{
            0x00419694L,0x004196d4L,0x00419714L,0x004195e8L,
            0x004195b0L,0x0041982cL,0x00419910L,
            0x00419b74L,0x00419d40L,0x0041aa40L
        });
        FOCUS.put("metadata-reset-and-append-90", new long[]{
            0x00419694L,0x004196d4L,0x00419714L,
            0x00419b74L,0x00419d40L,0x00419b00L,
            0x0041a8c4L,0x0041a9a8L,0x0041aa34L,
            0x0041aa40L,0x004478b8L,0x00447a54L
        });
        FOCUS.put("source-photos-count-producer-90", new long[]{
            0x00419d40L,0x00419b74L,0x0041a6bcL,
            0x00419694L,0x004196d4L,0x00419714L,
            0x0021976cL,0x0021b5f4L,
            0x0041c618L,0x0041d3dcL
        });
        FOCUS.put("session-runtime-callers-90", new long[]{
            0x001f0858L,0x0021a2b0L,0x0021a394L,
            0x004195c8L,0x0041a8c4L,0x0041aa40L,
            0x00419b74L,0x00419d40L,
            0x0021a15cL,0x0021a2e8L,0x001f078cL
        });
        FOCUS.put("session-jni-calibration-91", new long[]{
            0x001f0784L,0x001f0858L,0x001f0e48L,
            0x004195c8L,0x00419714L,0x0041aa40L
        });
        FOCUS.put("session-jni-restore-91", new long[]{
            0x001ee5d4L,0x0021a34cL,0x0021a394L,
            0x004195c8L,0x00419714L,0x0041a6bcL
        });
        FOCUS.put("session-owner-init-91", new long[]{
            0x0021a0e8L,0x0021a2b0L,0x0021a34cL,
            0x004195c8L,0x00419714L,0x0041a84cL,
            0x0041aa40L,0x00419b74L,0x00419d40L
        });
        FOCUS.put("session-file-records-92", new long[]{
            0x00419714L,0x00447708L,0x004478b8L,0x0041b58cL,
            0x0041a9a8L,0x00419d40L,0x00419b74L,0x0041aa40L,
            0x004477e0L,0x00447884L,0x00447a54L
        });
        FOCUS.put("session-accessor-vtable-92", new long[]{
            0x00445b14L,0x00445c14L,0x00445c50L,0x00445d00L,
            0x00445e00L,0x00445f00L,0x00446000L,
            0x00419714L,0x0021a34cL,0x0041a6bcL
        });
        FOCUS.put("session-rebuild-camera-92", new long[]{
            0x0021a204L,0x0021a34cL,0x001ee5d4L,
            0x00431344L,0x0041a6bcL,0x00443e74L,
            0x004440ecL,0x00419714L,0x004405c8L
        });
        FOCUS.put("session-jpeg-index-format-93", new long[]{
            0x0022148cL,0x0041a9a8L,0x00419714L,0x00447708L,
            0x0041a84cL,0x00445b14L,0x00445eccL
        });
        FOCUS.put("orientation-record-io-93", new long[]{
            0x0041b58cL,0x00419714L,0x00419b74L,0x0041a6bcL,
            0x0041b400L,0x00443e74L,0x004478b8L
        });
        FOCUS.put("jpeg-header-dimensions-93", new long[]{
            0x0044753cL,0x00446044L,0x004475f0L,0x00447708L,
            0x00447c9cL,0x00447a54L,0x00447884L
        });
        FOCUS.put("orientation-writer-xrefs-94", new long[]{
            0x0041b400L,0x0041b58cL,0x0041a6bcL,
            0x00443e74L,0x0041a84cL,0x0041a2fcL,
            0x0041aa40L,0x00419b74L,0x00419714L
        });
        FOCUS.put("metadata-file-reset-94", new long[]{
            0x00419b74L,0x00419d40L,0x0041aa40L,
            0x0041a8c4L,0x0041a2fcL,0x00447884L,
            0x00447708L,0x004195c8L,0x0021a0e8L
        });
        FOCUS.put("jpeg-header-accessor-94", new long[]{
            0x0044753cL,0x00446044L,0x00445b14L,
            0x0041a9a8L,0x0021a34cL,0x0021a204L,
            0x00447708L,0x004460e0L
        });
    }
    private PrintWriter report;
    private File dir;
    private FunctionManager fm;
    private DecompInterface dec;
    private Function find(long va) {
        Address a=toAddr(va);
        Function f=fm.getFunctionAt(a);
        return f!=null?f:fm.getFunctionContaining(a);
    }
    private void outputFunction(Function f,String tag) throws Exception {
        if(f==null || f.isExternal()) return;
        String id=f.getEntryPoint().toString();
        String safe=id.replaceAll("[^0-9a-zA-Z]","_");
        report.println(tag+"\t"+id+"\t"+f.getName()+"\tnoReturn="+f.hasNoReturn());
        DecompileResults result=dec.decompileFunction(f,150,monitor);
        try(PrintWriter w=new PrintWriter(new File(dir,safe+"_"+tag+".c"))) {
            w.println("/* "+tag+" "+f.getName()+" "+f.getEntryPoint()+" */");
            if(result.decompileCompleted()&&result.getDecompiledFunction()!=null)
                w.println(result.getDecompiledFunction().getC());
            else w.println("DECOMPILE FAILED: "+result.getErrorMessage());
        }
        try(PrintWriter w=new PrintWriter(new File(dir,safe+"_"+tag+".asm"))) {
            InstructionIterator it=currentProgram.getListing().getInstructions(f.getBody(),true);
            int n=0;
            while(it.hasNext()&&n++<2400) {
                Instruction ins=it.next();
                w.println(ins.getAddress()+"\t"+ins.toString());
            }
            w.println("instruction_rows="+n);
        }
        int callers=0;
        for(Function c:f.getCallingFunctions(monitor)) {
            if(callers++>=16)break;
            report.println("CALLER\t"+id+"\t"+c.getEntryPoint()+"\t"+c.getName());
        }
        int callees=0;
        for(Function c:f.getCalledFunctions(monitor)) {
            if(callees++>=28)break;
            report.println("CALLEE\t"+id+"\t"+c.getEntryPoint()+"\t"+c.getName());
        }
    }
    public void run() throws Exception {
        String[] args=getScriptArgs();
        dir=new File(args[0],args[1]);dir.mkdirs();
        String track=args[1];
        long[] targets=FOCUS.get(track);
        if(targets==null)throw new IllegalArgumentException("Unknown track: "+track);
        fm=currentProgram.getFunctionManager();
        dec=new DecompInterface();
        dec.toggleCCode(true); dec.toggleSyntaxTree(true);
        dec.setSimplificationStyle("decompile");
        dec.openProgram(currentProgram);
        report=new PrintWriter(new File(dir,"index.tsv"));
        report.println("TRACK\t"+track);
        report.println("BINARY\t"+currentProgram.getName()+"\t"+currentProgram.getImageBase());
        if(track.equals("rosette")) {
            Function allocator=find(0x004f19f4L);
            Function rosette=find(0x004440ecL);
            if(allocator!=null && rosette!=null) {
                report.println("ALLOCATOR_BEFORE\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn()+"\treturn="+allocator.getReturnType());
                outputFunction(rosette,"before");
                allocator.setNoReturn(false);
                allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
                dec.flushCache();
                report.println("ALLOCATOR_AFTER\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn()+"\treturn="+allocator.getReturnType());
                outputFunction(rosette,"after");
            }
        }
        if(track.equals("blend-vtable")) {
            Function allocator=find(0x004f19f4L);
            if(allocator==null) throw new IllegalStateException("Cannot resolve native allocator");
            report.println("ALLOCATOR_BEFORE\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn());
            allocator.setNoReturn(false);
            allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
            dec.flushCache();
            report.println("ALLOCATOR_AFTER\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn());
            Function factory=find(0x0043e930L);
            if(factory==null) throw new IllegalStateException("Missing blender factory");
            report.println("BLEND_FACTORY_BEFORE\t"+factory.getBody());
            for(long va=0x0043e940L;va<=0x0043e96cL;va+=4) {
                Address a=toAddr(va);
                if(currentProgram.getListing().getInstructionAt(a)==null)
                    disassemble(a);
                Instruction ins=currentProgram.getListing().getInstructionAt(a);
                report.println("BLEND_FACTORY_RAW\t"+a+"\t"+(ins==null?"MISSING":ins.toString()));
            }
            try {
                factory.setBody(new AddressSet(toAddr(0x0043e930L),toAddr(0x0043e96fL)));
                dec.flushCache();
                report.println("BLEND_FACTORY_AFTER\t"+factory.getBody());
            } catch(Exception ex) {
                report.println("BLEND_FACTORY_REPAIR_ERROR\t"+ex);
            }
        }
        if(track.equals("rosette-access")) {
            Function allocator=find(0x004f19f4L);
            Function rosette=find(0x004440ecL);
            if(allocator!=null && rosette!=null) {
                report.println("BEFORE_REPAIR\t"+rosette.getBody()+"\tallocator_noreturn="+allocator.hasNoReturn());
                try {
                    allocator.setNoReturn(false);
                    allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
                    for(long va:new long[]{0x0044413cL,0x0044419cL,0x004441bcL}) {
                        if(currentProgram.getListing().getInstructionAt(toAddr(va))==null)
                            disassemble(toAddr(va));
                    }
                    rosette.setBody(new AddressSet(toAddr(0x004440ecL),toAddr(0x004441dfL)));
                    dec.flushCache();
                    report.println("AFTER_REPAIR\t"+rosette.getBody()+"\tallocator_noreturn="+allocator.hasNoReturn());
                    outputFunction(rosette,"fixed");
                } catch(Exception e) {
                    report.println("REPAIR_ERROR\t"+e.toString());
                }
            }
        }
        Set<Function> selected=new LinkedHashSet<>();
        for(long va:targets) {
            Function f=find(va);
            report.println("TARGET\t"+Long.toHexString(va)+"\t"+(f==null?"MISSING":f.getEntryPoint()+"\t"+f.getName()));
            if(f!=null)selected.add(f);
        }
        if(track.equals("session-writer-callers-88")) {
            for(long va:new long[]{0x00419b74L,0x0021976cL}) {
                Function focus=find(va);
                if(focus==null)continue;
                int n=0;
                for(Function c:focus.getCallingFunctions(monitor)) {
                    report.println("DIRECT_CALLER\\t"+focus.getEntryPoint()+"\\t"+c.getEntryPoint()+"\\t"+c.getName());
                    if(n++<24)selected.add(c);
                }
            }
        }
        if(track.equals("metadata-count-path-88")) {
            DataIterator it=currentProgram.getListing().getDefinedData(true);
            ReferenceManager rm=currentProgram.getReferenceManager();
            int hits=0;
            while(it.hasNext()) {
                Data d=it.next();
                if(!d.hasStringValue())continue;
                Object v=d.getValue();
                if(!(v instanceof String))continue;
                String q=(String)v;
                if(!q.contains("source_photos_count") && !q.contains("orientations.txt") && !q.contains("session.meta") && !q.contains("cropped_area_left") && !q.contains("filepath,%s"))continue;
                report.println("METADATA_KEY\\t"+d.getAddress()+"\\t"+q.replace((char)10,' '));
                ReferenceIterator refs=rm.getReferencesTo(d.getAddress());
                for(int k=0;refs.hasNext() && k<25;k++) {
                    Reference rr=refs.next();
                    Function caller=fm.getFunctionContaining(rr.getFromAddress());
                    report.println("METADATA_KEY_XREF\\t"+rr.getFromAddress()+"\\t"+(caller==null?"NONE":caller.getEntryPoint()));
                    if(caller!=null)selected.add(caller);
                }
                if(++hits>48)break;
            }
        }
        if(track.equals("session-storage-vtables-89")) {
            ReferenceManager references=currentProgram.getReferenceManager();
            for(long va:new long[]{0x0041aa40L,0x00419d40L,0x00419b74L,0x004478b8L}) {
                ReferenceIterator itr=references.getReferencesTo(toAddr(va));
                int n=0;
                while(itr.hasNext() && n++<75) {
                    Reference ref=itr.next();
                    Function caller=fm.getFunctionContaining(ref.getFromAddress());
                    report.println("STORAGE_REFERENCE\\t0x"+Long.toHexString(va)+
                         "\\t"+ref.getFromAddress()+"\\t"+ref.getReferenceType()+
                         "\\t"+(caller==null?"DATA_OR_UNKNOWN":caller.getEntryPoint()));
                    if(caller!=null)selected.add(caller);
                }
            }
        }
        if(track.equals("rle-fill-calls-77")) {
            for(long va:new long[]{0x004360d8L,0x004373c0L,0x004376acL,
                                    0x0043b80cL,0x0043b824L,0x0041e1e8L}) {
                Function enclosing=fm.getFunctionContaining(toAddr(va));
                report.println("RLE_FILL_CALLSITE\\t0x"+Long.toHexString(va)+
                    "\\t"+(enclosing==null?"UNKNOWN":enclosing.getEntryPoint()+
                    "\\t"+enclosing.getName()));
                if(enclosing!=null)selected.add(enclosing);
            }
        }
        if(track.equals("blend-vtable")) {
            Address vt=toAddr(0x0050da08L);
            report.println("BLENDER_VTABLE\t"+vt);
            for(int slot=0;slot<10;slot++) {
                long ptr=currentProgram.getMemory().getLong(vt.add((long)slot*8));
                Function dest=(ptr>=0x00100000L && ptr<0x00500000L)?find(ptr):null;
                report.println("VTABLE_SLOT\t"+(slot*8)+"\t0x"+Long.toHexString(ptr)+"\t"+
                    (dest==null?"UNRESOLVED":dest.getEntryPoint()+" "+dest.getName()));
                if(slot==2 && dest!=null) outputFunction(dest,"vtable_blend_slot_10");
            }
        }
        if(track.equals("blend-weights")||track.equals("source-mapping")||track.equals("seam-cut")) {
            long[] bases=track.equals("blend-weights")?
              new long[]{0x0050d010L,0x0050d0c8L,0x0050d250L,0x0050d2c0L}:
              track.equals("source-mapping")?
              new long[]{0x0050da08L,0x0050d540L,0x0050d590L,0x0050d988L,0x0050d9b8L}:
              new long[]{0x0050d708L,0x0050d760L,0x0050d778L,0x0050d7d0L,0x0050d918L};
            for(long base:bases) {
                report.println("CANDIDATE_VTABLE\t0x"+Long.toHexString(base));
                for(int slot=0;slot<12;slot++) {
                    try {
                        long value=currentProgram.getMemory().getLong(toAddr(base+8L*slot));
                        Function target=(value>=0x00100000L&&value<0x00500000L)?find(value):null;
                        report.println("VTABLE_ENTRY\t0x"+Long.toHexString(base)+"\t+"+(8*slot)+"\t0x"+
                          Long.toHexString(value)+"\t"+(target==null?"not-function":target.getEntryPoint()));
                        if(target!=null && slot<5 && (base==0x0050d010L||base==0x0050d0c8L||
                          base==0x0050d988L||base==0x0050d9b8L||base==0x0050d708L))selected.add(target);
                    }catch(Exception e){report.println("VTABLE_READ_ERROR\t"+e);}
                }
            }
        }
        if(track.equals("mask-generator")) {
            Function allocator=find(0x004f19f4L);
            if(allocator==null)throw new IllegalStateException("Allocator function missing");
            allocator.setNoReturn(false);
            allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
            dec.flushCache();
            Function factory=find(0x0049c5d8L);
            if(factory!=null) {
                for(long va=0x0049c5e4L;va<=0x0049c600L;va+=4) {
                    Address addr=toAddr(va);
                    if(currentProgram.getListing().getInstructionAt(addr)==null)disassemble(addr);
                    Instruction ins=currentProgram.getListing().getInstructionAt(addr);
                    report.println("MASK_FACTORY_ARM64\t"+addr+"\t"+(ins==null?"MISSING":ins.toString()));
                }
                try {
                    factory.setBody(new AddressSet(toAddr(0x0049c5d8L),toAddr(0x0049c603L)));
                    dec.flushCache();
                }catch(Exception ex){report.println("MASK_FACTORY_BODY_ERROR\t"+ex);}
            }
            Address vt=toAddr(0x0050ed00L);
            report.println("MASK_FACTORY_VPTR\t"+vt);
            for(int slot=0;slot<22;slot++){
                long pointer=currentProgram.getMemory().getLong(vt.add(8L*slot));
                Function method=(pointer>=0x00100000L && pointer<0x00500000L)?
                    fm.getFunctionAt(toAddr(pointer)):null;
                report.println("MASK_VTABLE\t0x"+Integer.toHexString(slot*8)+
                    "\t0x"+Long.toHexString(pointer)+"\t"+
                    (method==null?"UNRESOLVED":method.getEntryPoint().toString())+
                    "\t"+(method==null?"":method.getName()));
                if(method!=null && (slot==1||slot==13||slot==14||slot==16))
                    selected.add(method);
            }
        }
        if(track.equals("seam-rle-methods")) {
            long base=0x0050ed00L;
            report.println("RLE_VTABLE\t0x"+Long.toHexString(base));
            for(int slot=0;slot<23;slot++) {
                long offset=(long)slot*8;
                try {
                    long ptr=currentProgram.getMemory().getLong(toAddr(base+offset));
                    Function target=(ptr>=0x00100000L&&ptr<0x00500000L)?find(ptr):null;
                    report.println("RLE_SLOT\t+0x"+Long.toHexString(offset)+"\t0x"+Long.toHexString(ptr)+"\t"+
                          (target==null?"none":target.getName()));
                    if(target!=null && (offset==0x50||offset==0x58||offset==0x68||
                         offset==0x70||offset==0x80||offset==0x78))selected.add(target);
                } catch(Exception e) {report.println("RLE_SLOT_ERROR\t"+e);}
            }
        }
        if(track.equals("session-storage-ctor-90")||
           track.equals("metadata-reset-and-append-90")||
           track.equals("source-photos-count-producer-90")) {
            ReferenceManager rm=currentProgram.getReferenceManager();
            for(long addr: new long[]{
                0x0050cc48L,0x0050cc50L,0x0050cc68L,0x0050cc70L,
                0x0050cca0L,0x00419694L,0x00419b74L,0x00419d40L
            }) {
                ReferenceIterator it=rm.getReferencesTo(toAddr(addr));
                int count=0;
                while(it.hasNext() && count++<60) {
                    Reference ref=it.next();
                    Function caller=fm.getFunctionContaining(ref.getFromAddress());
                    report.println("STORAGE_XREF\t0x"+Long.toHexString(addr)+
                        "\t"+ref.getFromAddress()+"\t"+ref.getReferenceType()+
                        "\t"+(caller==null?"NONE":caller.getEntryPoint()));
                    if(caller!=null)selected.add(caller);
                }
            }
            if(track.equals("source-photos-count-producer-90")) {
                DataIterator it=currentProgram.getListing().getDefinedData(true);
                int seen=0;
                while(it.hasNext()) {
                    Data d=it.next();
                    if(!d.hasStringValue() || !(d.getValue() instanceof String))continue;
                    String val=(String)d.getValue();
                    if(!val.contains("source_photos_count") && !val.contains("session.meta") &&
                       !val.contains("photo_count"))continue;
                    report.println("COUNT_STRING\t"+d.getAddress()+"\t"+val.replace('\n',' '));
                    ReferenceIterator refs=rm.getReferencesTo(d.getAddress());
                    while(refs.hasNext()) {
                        Reference ref=refs.next();
                        Function fn=fm.getFunctionContaining(ref.getFromAddress());
                        report.println("COUNT_XREF\t"+ref.getFromAddress()+"\t"+
                            (fn==null?"NONE":fn.getEntryPoint()));
                        if(fn!=null)selected.add(fn);
                    }
                    if(++seen>30)break;
                }
            }
        }
        if(track.equals("targets-meta")) {
            DataIterator it=currentProgram.getListing().getDefinedData(true);
            ReferenceManager rm=currentProgram.getReferenceManager();
            int strings=0;
            while(it.hasNext()) {
                Data d=it.next();
                if(!d.hasStringValue())continue;
                Object value=d.getValue();
                if(!(value instanceof String))continue;
                String s=(String)value;
                if(!s.matches("(?is).*?(session\\.meta|source_photos_count|yaw_correction_deg|pose_heading|target_generator\\.cc).*"))continue;
                report.println("STRING\t"+d.getAddress()+"\t"+s.replace('\n',' '));
                ReferenceIterator references=rm.getReferencesTo(d.getAddress());
                while(references.hasNext()) {
                    Reference ref=references.next();
                    Function f=fm.getFunctionContaining(ref.getFromAddress());
                    report.println("STRING_XREF\t"+ref.getFromAddress()+"\t"+(f==null?"NONE":f.getEntryPoint()));
                    if(f!=null)selected.add(f);
                }
                if(++strings>120)break;
            }
        }
        if(track.equals("source-lens-strings-79")) {
            DataIterator it=currentProgram.getListing().getDefinedData(true);
            ReferenceManager rm=currentProgram.getReferenceManager();
            int matches=0;
            while(it.hasNext()){
                Data d=it.next();
                if(!d.hasStringValue())continue;
                Object value=d.getValue();
                if(!(value instanceof String))continue;
                String str=(String)value;
                if(!str.matches("(?is).*?(distorti|undistort|camera_model|camera_intrins|radial|tangential|calibrat|pinhole).*"))continue;
                report.println("LENS_STRING\\t"+d.getAddress()+"\\t"+str.replace((char)10,' '));
                ReferenceIterator refs=rm.getReferencesTo(d.getAddress());
                int count=0;
                while(refs.hasNext() && count++ < 8){
                    Reference ref=refs.next();
                    Function caller=fm.getFunctionContaining(ref.getFromAddress());
                    report.println("LENS_STRING_REF\\t"+ref.getFromAddress()+"\\t"+(caller==null?"NONE":caller.getEntryPoint()));
                    if(caller!=null)selected.add(caller);
                }
                if(++matches>=85)break;
            }
        }
        if(track.equals("fov-final")) {
            for(long addr:new long[]{0x00161ae0L,0x00161ae8L,0x00161b48L}) {
                try {
                    long bits=currentProgram.getMemory().getLong(toAddr(addr));
                    report.println("READ_DOUBLE\t0x"+Long.toHexString(addr)+"\t0x"+
                        Long.toHexString(bits)+"\t"+Double.longBitsToDouble(bits));
                }catch(Exception e){report.println("READ_ERROR\t0x"+Long.toHexString(addr)+"\t"+e);}
            }
        }
        if(track.equals("flow-line")) {
            for(long va:new long[]{0x001ed94cL,0x001f327cL,0x00416a40L}) {
                Function f=find(va);
                if(f!=null) {
                    int n=0;
                    for(Function c:f.getCallingFunctions(monitor)) if(n++<8) selected.add(c);
                }
            }
        }
        for(Function f:selected)outputFunction(f,"investigate");
        report.close();
        dec.dispose();
    }
}