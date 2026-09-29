package kotlin.coroutines;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import p003a2.C0009a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0006J\b\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0007"}, m13365d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Serialized", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CombinedContext implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f38086a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext.InterfaceC6757a f38087b;

    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, m13365d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: a */
        public final CoroutineContext[] f38088a;

        public Serialized(CoroutineContext[] coroutineContextArr) {
            this.f38088a = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext coroutineContextMo1471C = EmptyCoroutineContext.f38093a;
            for (CoroutineContext coroutineContext : this.f38088a) {
                coroutineContextMo1471C = coroutineContextMo1471C.mo1471C(coroutineContext);
            }
            return coroutineContextMo1471C;
        }
    }

    public CombinedContext(CoroutineContext.InterfaceC6757a interfaceC6757a, CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "left");
        C5207g.m11111f(interfaceC6757a, "element");
        this.f38086a = coroutineContext;
        this.f38087b = interfaceC6757a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object writeReplace() {
        int iM13469c = m13469c();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iM13469c];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        mo1475y0(C9072e.f47360a, new InterfaceC2056p<C9072e, CoroutineContext.InterfaceC6757a, C9072e>() { // from class: kotlin.coroutines.CombinedContext.writeReplace.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(C9072e c9072e, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                C5207g.m11111f(c9072e, "<anonymous parameter 0>");
                C5207g.m11111f(interfaceC6757a2, "element");
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i10 = ref$IntRef2.f38125a;
                ref$IntRef2.f38125a = i10 + 1;
                coroutineContextArr[i10] = interfaceC6757a2;
                return C9072e.f47360a;
            }
        });
        if (ref$IntRef.f38125a == iM13469c) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX INFO: renamed from: c */
    public final int m13469c() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f38086a;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean zM11106a;
        if (this != obj) {
            z10 = false;
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.m13469c() == m13469c()) {
                    CombinedContext combinedContext2 = this;
                    while (true) {
                        CoroutineContext.InterfaceC6757a interfaceC6757a = combinedContext2.f38087b;
                        if (!C5207g.m11106a(combinedContext.mo1474w(interfaceC6757a.getKey()), interfaceC6757a)) {
                            zM11106a = false;
                            break;
                        }
                        CoroutineContext coroutineContext = combinedContext2.f38086a;
                        if (!(coroutineContext instanceof CombinedContext)) {
                            C5207g.m11109d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            CoroutineContext.InterfaceC6757a interfaceC6757a2 = (CoroutineContext.InterfaceC6757a) coroutineContext;
                            zM11106a = C5207g.m11106a(combinedContext.mo1474w(interfaceC6757a2.getKey()), interfaceC6757a2);
                            break;
                        }
                        combinedContext2 = (CombinedContext) coroutineContext;
                    }
                    if (zM11106a) {
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f38087b.hashCode() + this.f38086a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        CoroutineContext.InterfaceC6757a interfaceC6757a = this.f38087b;
        CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = interfaceC6757a.mo1474w(interfaceC6758b);
        CoroutineContext coroutineContext = this.f38086a;
        if (interfaceC6757aMo1474w != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMo1473m0 = coroutineContext.mo1473m0(interfaceC6758b);
        if (coroutineContextMo1473m0 == coroutineContext) {
            return this;
        }
        return coroutineContextMo1473m0 == EmptyCoroutineContext.f38093a ? interfaceC6757a : new CombinedContext(interfaceC6757a, coroutineContextMo1473m0);
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("["), (String) mo1475y0("", new InterfaceC2056p<String, CoroutineContext.InterfaceC6757a, String>() { // from class: kotlin.coroutines.CombinedContext.toString.1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final String mo1337m0(String str, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                String str2 = str;
                CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                C5207g.m11111f(str2, "acc");
                C5207g.m11111f(interfaceC6757a2, "element");
                if (str2.length() == 0) {
                    return interfaceC6757a2.toString();
                }
                return str2 + ", " + interfaceC6757a2;
            }
        }), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.f38087b.mo1474w(interfaceC6758b);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = combinedContext.f38086a;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.mo1474w(interfaceC6758b);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0((Object) this.f38086a.mo1475y0(r10, interfaceC2056p), this.f38087b);
    }
}
