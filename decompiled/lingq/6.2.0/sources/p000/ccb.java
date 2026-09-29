package p000;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
public final class ccb implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dcb f9896b;

    public ccb(dcb dcbVar, String str) {
        this.f9896b = dcbVar;
        this.f9895a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        ClassLoader classLoader = this.f9896b.f35412c;
        String str = this.f9895a;
        return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
    }
}
