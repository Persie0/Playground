package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlt implements mrf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hlv f28278a;

    public hlt(hlv hlvVar) {
        this.f28278a = hlvVar;
    }

    @Override // p000.mrf
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        try {
            ((bpv) obj).m2897g(this.f28278a.f28283c);
            return null;
        } catch (IOException e) {
            ((nbe) ((nbe) hlv.f28281a.m17251b()).mo17276G((char) 3733)).mo17290o("Purge cache failed.");
            return null;
        }
    }
}
