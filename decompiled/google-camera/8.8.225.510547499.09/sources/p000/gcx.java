package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcx extends jxc {
    public gcx(jwn jwnVar, jwn jwnVar2, jwn jwnVar3, jwn jwnVar4, jwn jwnVar5, jwn jwnVar6) {
        super(jwr.m13632b(jwnVar, jwnVar3, jwnVar4, jwnVar5, jwnVar2, jwnVar6));
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        List list = (List) obj;
        return (((Integer) list.get(1)).intValue() == 0 && ((Float) list.get(2)).floatValue() == -1.0f && ((Float) list.get(3)).floatValue() == -1.0f && !((Boolean) list.get(4)).booleanValue() && !((Boolean) list.get(5)).booleanValue()) ? (gcy) list.get(0) : gcy.OFF;
    }
}
