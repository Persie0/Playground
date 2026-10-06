package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eoy implements mmf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f14936a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f14937b;

    public /* synthetic */ eoy(List list, int i) {
        this.f14937b = i;
        this.f14936a = list;
    }

    @Override // p000.mmf
    /* JADX INFO: renamed from: a */
    public final void mo7607a(mmb mmbVar, int i) {
        switch (this.f14937b) {
            case 0:
                List list = this.f14936a;
                mmbVar.m16618c(((epb) list.get(i)).f14946b);
                mmbVar.f41010a = ((epb) list.get(i)).f14945a;
                break;
            default:
                List list2 = this.f14936a;
                Integer num = daz.f10352a;
                mmbVar.m16618c((CharSequence) list2.get(i));
                break;
        }
    }
}
