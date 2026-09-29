package kotlinx.coroutines;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5213m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJY\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m13365d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lwl/c;", "", "block", "completion", "Lsl/e;", "invoke", "(Lcm/l;Lwl/c;)V", "R", "Lkotlin/Function2;", "receiver", "(Lcm/p;Ljava/lang/Object;Lwl/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C7078a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39991a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f39991a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final <T> void invoke(InterfaceC2052l<? super InterfaceC9968c<? super T>, ? extends Object> block, InterfaceC9968c<? super T> completion) {
        int i10 = C7078a.f39991a[ordinal()];
        if (i10 == 1) {
            try {
                C0062b.m308S1(C8656b.m16874A(C8656b.m16907o(block, completion)), C9072e.f47360a, null);
                return;
            } catch (Throwable th2) {
                completion.mo2031y(C7499b.m14967u(th2));
                throw th2;
            }
        }
        if (i10 == 2) {
            C5207g.m11111f(block, "<this>");
            C5207g.m11111f(completion, "completion");
            C8656b.m16874A(C8656b.m16907o(block, completion)).mo2031y(C9072e.f47360a);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        C5207g.m11111f(completion, "completion");
        try {
            CoroutineContext coroutineContextMo2029e = completion.mo2029e();
            Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e, null);
            try {
                C5213m.m11200e(1, block);
                Object objMo528n = block.mo528n(completion);
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                if (objMo528n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    completion.mo2031y(objMo528n);
                }
            } catch (Throwable th3) {
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                throw th3;
            }
        } catch (Throwable th4) {
            completion.mo2031y(C7499b.m14967u(th4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final <R, T> void invoke(InterfaceC2056p<? super R, ? super InterfaceC9968c<? super T>, ? extends Object> block, R receiver, InterfaceC9968c<? super T> completion) {
        int i10 = C7078a.f39991a[ordinal()];
        if (i10 == 1) {
            try {
                C0062b.m308S1(C8656b.m16874A(C8656b.m16908p(block, receiver, completion)), C9072e.f47360a, null);
            } catch (Throwable th2) {
                completion.mo2031y(C7499b.m14967u(th2));
                throw th2;
            }
        } else {
            if (i10 == 2) {
                C5207g.m11111f(block, "<this>");
                C5207g.m11111f(completion, "completion");
                C8656b.m16874A(C8656b.m16908p(block, receiver, completion)).mo2031y(C9072e.f47360a);
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            C5207g.m11111f(completion, "completion");
            try {
                CoroutineContext coroutineContextMo2029e = completion.mo2029e();
                Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e, null);
                try {
                    C5213m.m11200e(2, block);
                    Object objMo1337m0 = block.mo1337m0(receiver, completion);
                    ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                    if (objMo1337m0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        completion.mo2031y(objMo1337m0);
                    }
                } catch (Throwable th3) {
                    ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                    throw th3;
                }
            } catch (Throwable th4) {
                completion.mo2031y(C7499b.m14967u(th4));
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
