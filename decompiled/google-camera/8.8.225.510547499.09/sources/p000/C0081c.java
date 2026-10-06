package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: c */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0081c implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Class f4874a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f4875b = KMNlNMe.IKCQjLGlDh;

    public C0081c(Class cls) {
        this.f4874a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return this.f4874a.getResourceAsStream(this.f4875b);
    }
}
