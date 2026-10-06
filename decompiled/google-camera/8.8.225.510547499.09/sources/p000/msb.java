package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum msb {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME(VzWFSVj.impfbUGCzkINF),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR(xPAWq.VQbkP),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    f41523q("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");


    /* JADX INFO: renamed from: D */
    private final String f41533D;

    msb(String str) {
        this.f41533D = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m16855a() {
        return System.getProperty(this.f41533D);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41533D + "=" + m16855a();
    }
}
