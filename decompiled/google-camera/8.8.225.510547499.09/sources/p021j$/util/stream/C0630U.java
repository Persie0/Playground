package p021j$.util.stream;

import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.U */
/* JADX INFO: loaded from: classes3.dex */
final class C0630U extends C0633V {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f33358k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630U(int i, Spliterator spliterator, AbstractC0586F abstractC0586F) {
        super(abstractC0586F, spliterator, new C0652b(10), new C0652b(11));
        if (i != 1) {
        } else {
            super(abstractC0586F, spliterator, new C0652b(12), new C0652b(13));
        }
    }

    public C0630U(Spliterator spliterator, AbstractC0586F abstractC0586F, IntFunction intFunction) {
        super(abstractC0586F, spliterator, new C0648a(2, intFunction), new C0652b(14));
    }
}
