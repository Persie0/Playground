package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p249lo.AbstractC7417j;
import p249lo.C7416i;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Llo/j;", "Landroid/view/View;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@InterfaceC10224c(m19205c = "androidx.core.view.ViewKt$allViews$1", m19206f = "View.kt", m19207l = {414, 416}, m19208m = "invokeSuspend")
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements InterfaceC2056p<AbstractC7417j<? super View>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: c */
    public int f5599c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f5600d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f5601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC9968c<? super ViewKt$allViews$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5601e = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f5601e, interfaceC9968c);
        viewKt$allViews$1.f5600d = obj;
        return viewKt$allViews$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(AbstractC7417j<? super View> abstractC7417j, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ViewKt$allViews$1) mo1336a(abstractC7417j, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        AbstractC7417j abstractC7417j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5599c;
        View view = this.f5601e;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC7417j = (AbstractC7417j) this.f5600d;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        abstractC7417j = (AbstractC7417j) this.f5600d;
        this.f5600d = abstractC7417j;
        this.f5599c = 1;
        if (abstractC7417j.mo14819a(view, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C5207g.m11111f(viewGroup, "<this>");
            ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(viewGroup, null);
            this.f5600d = null;
            this.f5599c = 2;
            abstractC7417j.getClass();
            C7416i c7416i = new C7416i();
            c7416i.f41257d = C8656b.m16908p(viewGroupKt$descendants$1, c7416i, c7416i);
            Object objMo14820c = abstractC7417j.mo14820c(c7416i, this);
            if (objMo14820c != coroutineSingletons) {
                objMo14820c = C9072e.f47360a;
            }
            if (objMo14820c == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
