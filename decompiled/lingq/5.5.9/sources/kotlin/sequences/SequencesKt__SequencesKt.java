package kotlin.sequences;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import kotlin.collections.C6744b;
import p249lo.C7408a;
import p249lo.C7411d;
import p249lo.C7413f;
import p249lo.C7414g;
import p249lo.C7423p;
import p249lo.InterfaceC7415h;

/* JADX INFO: loaded from: classes2.dex */
public class SequencesKt__SequencesKt extends C0062b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$a */
    public static final class C7072a<T> implements InterfaceC7415h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f39959a;

        public C7072a(Iterator it) {
            this.f39959a = it;
        }

        @Override // p249lo.InterfaceC7415h
        public final Iterator<T> iterator() {
            return this.f39959a;
        }
    }

    /* JADX INFO: renamed from: I2 */
    public static final <T> InterfaceC7415h<T> m14248I2(Iterator<? extends T> it) {
        C5207g.m11111f(it, "<this>");
        return m14249J2(new C7072a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J2 */
    public static final <T> InterfaceC7415h<T> m14249J2(InterfaceC7415h<? extends T> interfaceC7415h) {
        return interfaceC7415h instanceof C7408a ? interfaceC7415h : new C7408a(interfaceC7415h);
    }

    /* JADX INFO: renamed from: K2 */
    public static final C7413f m14250K2(InterfaceC7415h interfaceC7415h) {
        SequencesKt__SequencesKt$flatten$1 sequencesKt__SequencesKt$flatten$1 = new InterfaceC2052l<InterfaceC7415h<Object>, Iterator<Object>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Iterator<Object> mo528n(InterfaceC7415h<Object> interfaceC7415h2) {
                InterfaceC7415h<Object> interfaceC7415h3 = interfaceC7415h2;
                C5207g.m11111f(interfaceC7415h3, "it");
                return interfaceC7415h3.iterator();
            }
        };
        if (!(interfaceC7415h instanceof C7423p)) {
            return new C7413f(interfaceC7415h, new InterfaceC2052l<Object, Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$3
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Object mo528n(Object obj) {
                    return obj;
                }
            }, sequencesKt__SequencesKt$flatten$1);
        }
        C7423p c7423p = (C7423p) interfaceC7415h;
        C5207g.m11111f(sequencesKt__SequencesKt$flatten$1, "iterator");
        return new C7413f(c7423p.f41267a, c7423p.f41268b, sequencesKt__SequencesKt$flatten$1);
    }

    /* JADX INFO: renamed from: L2 */
    public static final <T> InterfaceC7415h<T> m14251L2(final InterfaceC2041a<? extends T> interfaceC2041a) {
        return m14249J2(new C7414g(interfaceC2041a, new InterfaceC2052l<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final T mo528n(T t10) {
                C5207g.m11111f(t10, "it");
                return interfaceC2041a.mo807E();
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public static final <T> InterfaceC7415h<T> m14252M2(final T t10, InterfaceC2052l<? super T, ? extends T> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "nextFunction");
        return t10 == null ? C7411d.f41235a : new C7414g(new InterfaceC2041a<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final T mo807E() {
                return t10;
            }
        }, interfaceC2052l);
    }

    /* JADX INFO: renamed from: N2 */
    public static final <T> InterfaceC7415h<T> m14253N2(T... tArr) {
        return tArr.length == 0 ? C7411d.f41235a : C6744b.m13376h0(tArr);
    }
}
