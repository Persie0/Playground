package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

/* JADX INFO: renamed from: j$.nio.file.attribute.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0379t {
    /* JADX INFO: renamed from: a */
    public static FileAttribute m12179a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return m12183e(fileAttribute.value()) ? new C0377r(fileAttribute) : C0375p.m12177a(fileAttribute);
    }

    /* JADX INFO: renamed from: b */
    public static C0340E m12180b(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return C0340E.m12121f(fileTime.toMillis());
    }

    /* JADX INFO: renamed from: c */
    public static FileAttribute m12181c(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return m12183e(fileAttribute.value()) ? new C0378s(fileAttribute) : C0376q.m12178a(fileAttribute);
    }

    /* JADX INFO: renamed from: d */
    public static FileTime m12182d(C0340E c0340e) {
        if (c0340e == null) {
            return null;
        }
        return FileTime.fromMillis(c0340e.m12127l());
    }

    /* JADX INFO: renamed from: e */
    private static boolean m12183e(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof EnumC0350O) || (next instanceof PosixFilePermission);
    }
}
