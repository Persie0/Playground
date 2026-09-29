package androidx.room;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.ci8;
import p000.vi3;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RoomDatabase$createConnectionManager$2 extends FunctionReferenceImpl implements zi3 {
    public RoomDatabase$createConnectionManager$2(AbstractC0746d abstractC0746d) {
        super(2, abstractC0746d, ci8.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return AbstractC0747e.m2848a((vi3) obj, (AbstractC0746d) this.f47704b, (Continuation) obj2);
    }
}
