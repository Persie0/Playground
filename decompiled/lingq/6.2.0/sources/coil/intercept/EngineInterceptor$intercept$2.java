package coil.intercept;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.C0855a;
import coil.decode.DataSource;
import coil.memory.MemoryCache$Key;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3057h;
import p000.C3386nv;
import p000.c32;
import p000.e04;
import p000.hn9;
import p000.l70;
import p000.lp9;
import p000.m18;
import p000.ms2;
import p000.or3;
import p000.sz6;
import p000.un1;
import p000.wt2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor$intercept$2", m4291f = "EngineInterceptor.kt", m4292l = {77}, m4293m = "invokeSuspend")
final class EngineInterceptor$intercept$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10528a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0862a f10529b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e04 f10530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10531d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sz6 f10532e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wt2 f10533f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MemoryCache$Key f10534g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0863b f10535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(C0862a c0862a, e04 e04Var, Object obj, sz6 sz6Var, wt2 wt2Var, MemoryCache$Key memoryCache$Key, C0863b c0863b, Continuation continuation) {
        super(2, continuation);
        this.f10529b = c0862a;
        this.f10530c = e04Var;
        this.f10531d = obj;
        this.f10532e = sz6Var;
        this.f10533f = wt2Var;
        this.f10534g = memoryCache$Key;
        this.f10535h = c0863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.f10529b, this.f10530c, this.f10531d, this.f10532e, this.f10533f, this.f10534g, this.f10535h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$intercept$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        EngineInterceptor$intercept$2 engineInterceptor$intercept$2;
        m18 m18Var;
        Bitmap bitmap;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10528a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0862a c0862a = this.f10529b;
            e04 e04Var = this.f10530c;
            Object obj2 = this.f10531d;
            sz6 sz6Var = this.f10532e;
            wt2 wt2Var = this.f10533f;
            this.f10528a = 1;
            engineInterceptor$intercept$2 = this;
            obj = C0862a.m4976c(c0862a, e04Var, obj2, sz6Var, wt2Var, engineInterceptor$intercept$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            engineInterceptor$intercept$2 = this;
        }
        ms2 ms2Var = (ms2) obj;
        lp9 lp9Var = engineInterceptor$intercept$2.f10529b.f10554b;
        synchronized (lp9Var) {
            try {
                C0855a c0855a = (C0855a) lp9Var.f49985a.get();
                if (c0855a == null) {
                    lp9Var.m16428b();
                } else if (lp9Var.f49986b == null) {
                    Context context = c0855a.f10404a;
                    lp9Var.f49986b = context;
                    context.registerComponentCallbacks(lp9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        or3 or3Var = engineInterceptor$intercept$2.f10529b.f10556d;
        MemoryCache$Key memoryCache$Key = engineInterceptor$intercept$2.f10534g;
        if (!engineInterceptor$intercept$2.f10530c.f36515n.getWriteEnabled() || (m18Var = (m18) ((C0855a) or3Var.f54782a).f10406c.getValue()) == null || memoryCache$Key == null) {
            z = false;
        } else {
            Drawable drawable = ms2Var.f51793a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(ms2Var.f51794b));
                String str = ms2Var.f51796d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                m18Var.f50436a.mo12100a(new MemoryCache$Key(memoryCache$Key.f10564a, l70.m15919J(memoryCache$Key.f10565b)), bitmap, l70.m15919J(linkedHashMap));
                z = true;
            }
        }
        Drawable drawable2 = ms2Var.f51793a;
        e04 e04Var2 = engineInterceptor$intercept$2.f10530c;
        DataSource dataSource = ms2Var.f51795c;
        MemoryCache$Key memoryCache$Key2 = z ? engineInterceptor$intercept$2.f10534g : null;
        String str2 = ms2Var.f51796d;
        boolean z2 = ms2Var.f51794b;
        C0863b c0863b = engineInterceptor$intercept$2.f10535h;
        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
        return new hn9(drawable2, e04Var2, dataSource, memoryCache$Key2, str2, z2, (c0863b instanceof C0863b) && c0863b.f10563g);
    }
}
