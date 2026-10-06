package p000;

import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.YuvImage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fqe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23198d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f23199e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f23200f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f23201g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f23202h;

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ int f23203i;

    public /* synthetic */ fqe(FastMomentsHdrImpl fastMomentsHdrImpl, kpw kpwVar, fta ftaVar, NormalizedRect normalizedRect, ShotMetadata shotMetadata, jfz jfzVar, HardwareBuffer hardwareBuffer, fsy fsyVar, int i, byte[] bArr) {
        this.f23203i = i;
        this.f23195a = fastMomentsHdrImpl;
        this.f23196b = kpwVar;
        this.f23197c = ftaVar;
        this.f23198d = normalizedRect;
        this.f23199e = shotMetadata;
        this.f23200f = jfzVar;
        this.f23201g = hardwareBuffer;
        this.f23202h = fsyVar;
    }

    public /* synthetic */ fqe(kbz kbzVar, jvb jvbVar, oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, Executor executor, mrm mrmVar, int i) {
        this.f23203i = i;
        this.f23195a = kbzVar;
        this.f23201g = jvbVar;
        this.f23197c = ojuVar;
        this.f23196b = ojuVar2;
        this.f23198d = ojuVar3;
        this.f23199e = ojuVar4;
        this.f23200f = executor;
        this.f23202h = mrmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v0, types: [fsy, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        HardwareBuffer hardwareBufferProcessRaw10ToYuvHardwareBufferNative;
        switch (this.f23203i) {
            case 0:
                Object obj = this.f23195a;
                ?? r2 = this.f23196b;
                Object obj2 = this.f23197c;
                Object obj3 = this.f23198d;
                Object obj4 = this.f23199e;
                Object obj5 = this.f23200f;
                Object obj6 = this.f23201g;
                ?? r8 = this.f23202h;
                try {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    RawWriteView rawWriteViewM17649b = ((FastMomentsHdrImpl) obj).f6818d.m17649b(r2);
                    Object obj7 = ((fta) obj2).f23537c;
                    AeShotParams aeShotParams = new AeShotParams(GcamModuleJNI.new_AeShotParams__SWIG_1(((AeShotParams) obj7).f8226a, (AeShotParams) obj7), true);
                    aeShotParams.m4891h(false);
                    long j = aeShotParams.f8226a;
                    long jM5092c = RawWriteView.m5092c(rawWriteViewM17649b);
                    long jM5050a = NormalizedRect.m5050a((NormalizedRect) obj3);
                    long jM5095a = ShotMetadata.m5095a((ShotMetadata) obj4);
                    kbo kboVar = ((FastMomentsHdrImpl) obj).f6815a;
                    long jM5142a = aeShotParams.m4886c().m5142a();
                    String hexString = Long.toHexString(j);
                    WeightedNormalizedRectVector weightedNormalizedRectVectorM4886c = aeShotParams.m4886c();
                    kboVar.mo13940b("Processing moments HDR with " + jM5142a + " metering areas, shot params ptr=0x" + hexString + ", weighted_metering_areas ptr=0x" + Long.toHexString(weightedNormalizedRectVectorM4886c == null ? 0L : weightedNormalizedRectVectorM4886c.f8385a));
                    int i = ((jfz) obj5).f33931c;
                    if (i == 3) {
                        long j2 = ((FastMomentsHdrImpl) obj).f6816b;
                        long jM4971a = Gcam.m4971a(((FastMomentsHdrImpl) obj).f6817c);
                        int i2 = ((fta) obj2).f23535a;
                        Object obj8 = ((jfz) obj5).f33932d;
                        long jProcessRaw10ToYuvImageNative = ((FastMomentsHdrImpl) obj).processRaw10ToYuvImageNative(j2, jM4971a, i2, (HardwareBuffer) obj6, jM5092c, j, jM5050a, ((kbc) obj8).f35517a, ((kbc) obj8).f35518b, jM5095a, ((jfz) obj5).f33929a);
                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                        ((FastMomentsHdrImpl) obj).f6815a.mo13940b("processRaw10ToYuv, total time: " + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos2 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS) + "ms");
                        if (jProcessRaw10ToYuvImageNative == 0) {
                            r8.mo8699a(new RuntimeException("Error processing raw10 to Yuv image"));
                        } else {
                            r8.mo8701c(new YuvImage(jProcessRaw10ToYuvImageNative), (ShotMetadata) ((fta) obj2).f23536b);
                        }
                    } else {
                        if (i == 1) {
                            long j3 = ((FastMomentsHdrImpl) obj).f6816b;
                            long jM4971a2 = Gcam.m4971a(((FastMomentsHdrImpl) obj).f6817c);
                            int i3 = ((fta) obj2).f23535a;
                            long j4 = ((jfz) obj5).f33930b;
                            Object obj9 = ((jfz) obj5).f33932d;
                            hardwareBufferProcessRaw10ToYuvHardwareBufferNative = ((FastMomentsHdrImpl) obj).processRaw10ToRgbaHardwareBufferNative(j3, jM4971a2, i3, j4, (HardwareBuffer) obj6, jM5092c, j, jM5050a, ((kbc) obj9).f35517a, ((kbc) obj9).f35518b, jM5095a, ((jfz) obj5).f33929a);
                        } else {
                            long j5 = ((FastMomentsHdrImpl) obj).f6816b;
                            long jM4971a3 = Gcam.m4971a(((FastMomentsHdrImpl) obj).f6817c);
                            int i4 = ((fta) obj2).f23535a;
                            long j6 = ((jfz) obj5).f33930b;
                            Object obj10 = ((jfz) obj5).f33932d;
                            hardwareBufferProcessRaw10ToYuvHardwareBufferNative = ((FastMomentsHdrImpl) obj).processRaw10ToYuvHardwareBufferNative(j5, jM4971a3, i4, j6, (HardwareBuffer) obj6, jM5092c, j, jM5050a, ((kbc) obj10).f35517a, ((kbc) obj10).f35518b, jM5095a, ((jfz) obj5).f33929a);
                        }
                        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                        ((FastMomentsHdrImpl) obj).f6815a.mo13940b("processRaw10ToHardwareBuffer, total time: " + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos3 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS) + "ms");
                        if (hardwareBufferProcessRaw10ToYuvHardwareBufferNative == null) {
                            r8.mo8699a(new RuntimeException("Error processing raw10 to HardwareBuffer"));
                        } else if (((jfz) obj5).f33931c == 1) {
                            r8.mo8700b(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, (ShotMetadata) ((fta) obj2).f23536b);
                        } else {
                            r8.mo8702d(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, (ShotMetadata) ((fta) obj2).f23536b);
                        }
                    }
                    aeShotParams.toString();
                    rawWriteViewM17649b.toString();
                    return;
                } finally {
                    ((HardwareBuffer) obj6).close();
                }
            default:
                ?? r0 = this.f23195a;
                Object obj11 = this.f23201g;
                ?? r3 = this.f23197c;
                ?? r4 = this.f23196b;
                ?? r5 = this.f23198d;
                ?? r6 = this.f23199e;
                ?? r7 = this.f23200f;
                Object obj12 = this.f23202h;
                r0.mo13961e("MICRO_GyroModule#runGyroStartupTask");
                jvb jvbVar = (jvb) obj11;
                jvbVar.m13537d(new ezc(((C1058va) r3.get()).m19464C(), 5, (byte[]) null, (byte[]) null, (byte[]) null));
                ((dyf) r4.get()).m6920i("microvideo-metadata");
                jvbVar.m13537d(new ezc((oju) r4, 6));
                ((dxx) r5.get()).m6887c((dxy) r6.get(), r7);
                mrm mrmVar = (mrm) obj12;
                if (mrmVar.mo16813g()) {
                    ((fhq) mrmVar.mo16809c()).mo8449e();
                    jvbVar.m13537d(new ezc((fhq) mrmVar.mo16809c(), 7));
                }
                r0.mo13962f();
                return;
        }
    }
}
