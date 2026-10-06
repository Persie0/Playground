package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwj extends jxc {
    public fwj(jwn jwnVar, jwf jwfVar) {
        super(jwr.m13632b(jwnVar, jwfVar));
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        List list = (List) obj;
        kmp kmpVar = (kmp) list.get(0);
        if (((gss) list.get(1)) == gss.AUTO) {
            return 1;
        }
        return (kmpVar == kmp.FULL || kmpVar == kmp.SIMPLE || kmpVar == kmp.EXTENDED) ? 2 : 1;
    }
}
