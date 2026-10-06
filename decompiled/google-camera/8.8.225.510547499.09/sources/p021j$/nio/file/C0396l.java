package p021j$.nio.file;

import java.security.PrivilegedAction;
import p021j$.adapter.AbstractC0285b;
import p021j$.nio.file.spi.AbstractC0406c;

/* JADX INFO: renamed from: j$.nio.file.l */
/* JADX INFO: loaded from: classes3.dex */
final class C0396l implements PrivilegedAction {
    C0396l() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        AbstractC0406c abstractC0406cM11968a = AbstractC0285b.m11968a();
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    abstractC0406cM11968a = (AbstractC0406c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(AbstractC0406c.class).newInstance(abstractC0406cM11968a);
                    if (!abstractC0406cM11968a.mo12014l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return abstractC0406cM11968a;
    }
}
