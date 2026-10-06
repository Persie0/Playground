package p000;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: a */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0000a implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f0a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return System.getProperty(this.f0a);
    }
}
