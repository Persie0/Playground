package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p060d1.C5028o;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p519z.InterfaceC10424c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/v;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.text.TextController$update$2", m19206f = "CoreText.kt", m19207l = {192}, m19208m = "invokeSuspend")
public final class TextController$update$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2557e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2558f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TextController f2559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$update$2(TextController textController, InterfaceC9968c<? super TextController$update$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2559g = textController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        TextController$update$2 textController$update$2 = new TextController$update$2(this.f2559g, interfaceC9968c);
        textController$update$2.f2558f = obj;
        return textController$update$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TextController$update$2) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2557e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f2558f;
            final InterfaceC10424c interfaceC10424c = this.f2559g.f2541c;
            if (interfaceC10424c == null) {
                C5207g.m11117l("longPressDragObserver");
                throw null;
            }
            this.f2557e = 1;
            Object objM1445c = DragGestureDetectorKt.m1445c(interfaceC5035v, new InterfaceC2052l<C8941c, C9072e>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(C8941c c8941c) {
                    interfaceC10424c.mo1544c(c8941c.f46892a);
                    return C9072e.f47360a;
                }
            }, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    interfaceC10424c.mo1543b();
                    return C9072e.f47360a;
                }
            }, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    interfaceC10424c.mo1542a();
                    return C9072e.f47360a;
                }
            }, new InterfaceC2056p<C5028o, C8941c, C9072e>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C5028o c5028o, C8941c c8941c) {
                    long j10 = c8941c.f46892a;
                    C5207g.m11111f(c5028o, "<anonymous parameter 0>");
                    interfaceC10424c.mo1545d(j10);
                    return C9072e.f47360a;
                }
            }, this);
            if (objM1445c != coroutineSingletons) {
                objM1445c = C9072e.f47360a;
            }
            if (objM1445c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
