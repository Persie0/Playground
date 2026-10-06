package p000;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsw implements lsa {

    /* JADX INFO: renamed from: a */
    public lsg[] f39146a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lsx] */
    @Override // p000.lsa
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15928a(lie lieVar) {
        List listM15382a = lieVar.m15382a(lieVar.f38295b.mo15943j((Uri) lieVar.f38294a));
        lsg[] lsgVarArr = this.f39146a;
        if (lsgVarArr != null) {
            lsgVarArr[0].m15946a(listM15382a);
        }
        return (OutputStream) listM15382a.get(0);
    }
}
