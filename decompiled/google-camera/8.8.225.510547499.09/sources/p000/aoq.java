package p000;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class aoq extends C0831mq {

    /* JADX INFO: renamed from: d */
    final RecyclerView f1913d;

    /* JADX INFO: renamed from: e */
    final aei f1914e;

    /* JADX INFO: renamed from: f */
    final aei f1915f;

    public aoq(RecyclerView recyclerView) {
        super(recyclerView);
        this.f1914e = ((C0831mq) this).f41318b;
        this.f1915f = new aop(this);
        this.f1913d = recyclerView;
    }

    @Override // p000.C0831mq
    /* JADX INFO: renamed from: j */
    public final aei mo1780j() {
        return this.f1915f;
    }
}
