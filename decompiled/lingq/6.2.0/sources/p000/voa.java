package p000;

/* JADX INFO: loaded from: classes.dex */
public interface voa {
    /* JADX INFO: renamed from: b */
    boolean mo17607b();

    /* JADX INFO: renamed from: d */
    long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3);

    /* JADX INFO: renamed from: i */
    AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3);

    /* JADX INFO: renamed from: r */
    AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3);

    /* JADX INFO: renamed from: s */
    default AbstractC3081hn mo17609s(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return mo4033i(mo9842d(abstractC3081hn, abstractC3081hn2, abstractC3081hn3), abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }
}
