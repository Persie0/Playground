package p021j$.sun.security.action;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.sun.security.action.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0415a implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    private String f32903a = "file.encoding";

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty(this.f32903a);
        if (property == null) {
            return null;
        }
        return property;
    }
}
