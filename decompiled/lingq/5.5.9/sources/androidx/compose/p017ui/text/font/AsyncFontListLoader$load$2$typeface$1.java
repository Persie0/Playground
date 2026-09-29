package androidx.compose.p017ui.text.font;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p328q1.InterfaceC8468e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m19206f = "FontListFontFamilyTypefaceAdapter.kt", m19207l = {269}, m19208m = "invokeSuspend")
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super Object>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4598e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AsyncFontListLoader f4599f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC8468e f4600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, InterfaceC8468e interfaceC8468e, InterfaceC9968c<? super AsyncFontListLoader$load$2$typeface$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f4599f = asyncFontListLoader;
        this.f4600g = interfaceC8468e;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super Object> interfaceC9968c) {
        return ((AsyncFontListLoader$load$2$typeface$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new AsyncFontListLoader$load$2$typeface$1(this.f4599f, this.f4600g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4598e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f4598e = 1;
            obj = this.f4599f.m2592f(this.f4600g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
