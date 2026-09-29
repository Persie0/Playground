package androidx.compose.p017ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p328q1.C8481r;
import p328q1.C8482s;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Landroid/graphics/Typeface;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", m19206f = "AndroidFontLoader.android.kt", m19207l = {}, m19208m = "invokeSuspend")
final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Typeface>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8481r f4581e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f4582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(C8481r c8481r, Context context, InterfaceC9968c<? super AndroidFontLoader_androidKt$loadAsync$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4581e = c8481r;
        this.f4582f = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.f4581e, this.f4582f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Typeface> interfaceC9968c) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return C8482s.f45663a.m16553a(this.f4582f, this.f4581e);
    }
}
