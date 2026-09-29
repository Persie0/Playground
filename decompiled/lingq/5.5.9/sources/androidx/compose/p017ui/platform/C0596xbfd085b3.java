package androidx.compose.p017ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m19206f = "WindowRecomposer.android.kt", m19207l = {233}, m19208m = "invokeSuspend")
final class C0596xbfd085b3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4234e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Recomposer f4235f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f4236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596xbfd085b3(Recomposer recomposer, View view, InterfaceC9968c<? super C0596xbfd085b3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4235f = recomposer;
        this.f4236g = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C0596xbfd085b3(this.f4235f, this.f4236g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C0596xbfd085b3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4234e;
        Recomposer recomposer = this.f4235f;
        View view = this.f4236g;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f4234e = 1;
                if (recomposer.m1713v(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            if (C0604a2.m2330b(view) == recomposer) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return C9072e.f47360a;
        } catch (Throwable th2) {
            if (C0604a2.m2330b(view) == recomposer) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th2;
        }
    }
}
