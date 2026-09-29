package com.lingq.feature.reader.playback;

import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C0790ay;
import p000.C2944dy;
import p000.C3018fy;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.jy7;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$startObservingAudio$2", m4291f = "PlayerStateHolder.kt", m4292l = {225, 242}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$startObservingAudio$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public InterfaceC3055gy f29745a;

    /* JADX INFO: renamed from: b */
    public String f29746b;

    /* JADX INFO: renamed from: c */
    public boolean f29747c;

    /* JADX INFO: renamed from: d */
    public int f29748d;

    /* JADX INFO: renamed from: e */
    public int f29749e;

    /* JADX INFO: renamed from: f */
    public int f29750f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f29751g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2465a f29752h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$startObservingAudio$2(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29752h = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerStateHolder$startObservingAudio$2 playerStateHolder$startObservingAudio$2 = new PlayerStateHolder$startObservingAudio$2(this.f29752h, continuation);
        playerStateHolder$startObservingAudio$2.f29751g = obj;
        return playerStateHolder$startObservingAudio$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerStateHolder$startObservingAudio$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01aa, code lost:
    
        if (r3.mo8234r(r2, r36) == r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v10, types: [gy, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zMo8231E0;
        InterfaceC3055gy interfaceC3055gy;
        boolean z;
        LessonInfo lessonInfo;
        String str;
        C3244l c3244l;
        InterfaceC3812yx interfaceC3812yx;
        CoroutineSingletons coroutineSingletons;
        boolean z2;
        InterfaceC3055gy interfaceC3055gy2;
        boolean z3;
        Object obj2;
        ?? r13;
        Object obj3;
        boolean z4;
        CoroutineSingletons coroutineSingletons2;
        InterfaceC3812yx interfaceC3812yx2;
        ?? r6;
        String str2;
        InterfaceC3055gy interfaceC3055gy3;
        boolean z5;
        ?? r2;
        String str3;
        InterfaceC3055gy interfaceC3055gy4;
        String str4;
        String str5;
        String str6;
        ?? r12;
        ?? r11;
        ?? r5;
        Object obj4;
        ?? r14;
        C2465a c2465a = this.f29752h;
        C3244l c3244l2 = c2465a.f29789w;
        InterfaceC3812yx interfaceC3812yx3 = c2465a.f29769c;
        Pair pair = (Pair) this.f29751g;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29750f;
        char c = 2;
        boolean z6 = true;
        Object obj5 = null;
        if (i != 0) {
            if (i == 1) {
                int i2 = this.f29749e;
                int i3 = this.f29748d;
                z5 = this.f29747c;
                str3 = this.f29746b;
                interfaceC3055gy4 = this.f29745a;
                AbstractC3193b.m15359b(obj);
                c3244l = c3244l2;
                r14 = i3;
                interfaceC3812yx2 = interfaceC3812yx3;
                obj4 = null;
                coroutineSingletons2 = coroutineSingletons3;
                r2 = i2;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        LessonInfo lessonInfo2 = (LessonInfo) pair.f47623a;
        InterfaceC3055gy interfaceC3055gy5 = (InterfaceC3055gy) pair.f47624b;
        String str7 = lessonInfo2 != null ? lessonInfo2.f19369e : null;
        zMo8231E0 = interfaceC3812yx3.mo8231E0(c2465a.f29786t);
        boolean z7 = !(str7 == null || vk9.m23391n0(str7)) || zMo8231E0;
        C3244l c3244l3 = c2465a.f29784r;
        while (true) {
            Object value = c3244l3.getValue();
            if (c3244l3.m15570h(value, str7)) {
                break;
            }
            z6 = z6;
            interfaceC3055gy5 = interfaceC3055gy5;
            obj5 = obj5;
            str7 = str7;
            interfaceC3812yx3 = interfaceC3812yx3;
            c = c;
            lessonInfo2 = lessonInfo2;
        }
        boolean z8 = interfaceC3055gy5 instanceof C2944dy;
        C3244l c3244l4 = c2465a.f29782p;
        while (true) {
            Object value2 = c3244l4.getValue();
            interfaceC3055gy = interfaceC3055gy5;
            z = z8;
            if (c3244l4.m15570h(value2, jy7.m14750a((jy7) value2, false, false, 0L, 0L, 0.0f, null, z7, false, false, false, false, interfaceC3055gy, z, false, null, null, 59327))) {
                break;
            }
            obj5 = obj5;
            str7 = str7;
            interfaceC3055gy5 = interfaceC3055gy;
            z8 = z;
            interfaceC3812yx3 = interfaceC3812yx3;
            c = c;
            lessonInfo2 = lessonInfo2;
        }
        if (lessonInfo2 == null || !z7) {
            lessonInfo = lessonInfo2;
            str = str7;
            c3244l = c3244l2;
            interfaceC3812yx = interfaceC3812yx3;
            coroutineSingletons = coroutineSingletons3;
            z2 = z7;
            interfaceC3055gy2 = interfaceC3055gy;
            z3 = z;
            obj2 = obj5;
            z4 = z2;
            z4 = z2;
            obj3 = obj2;
            obj3 = obj2;
            r13 = z3;
            r13 = z3;
            if (lessonInfo == null && zMo8231E0) {
                C2465a.m9358a(c2465a, c2465a.f29786t, c2465a.f29787u, "", "", "", 0, "", 0, zMo8231E0);
            }
        } else {
            int i4 = lessonInfo2.f19365a;
            String str8 = c2465a.f29787u;
            if (str7 == null) {
                str5 = str7;
                str4 = "";
            } else {
                str4 = str7;
                str5 = str4;
            }
            String str9 = lessonInfo2.f19366b;
            String str10 = lessonInfo2.f19373i;
            if (str10 == null) {
                str10 = "";
                str6 = str10;
            } else {
                str6 = "";
            }
            int i5 = lessonInfo2.f19372h;
            String str11 = lessonInfo2.f19368d;
            if (str11 == null) {
                str11 = str6;
            }
            lessonInfo = lessonInfo2;
            String str12 = str10;
            String str13 = str11;
            str = str5;
            c3244l = c3244l2;
            interfaceC3812yx = interfaceC3812yx3;
            coroutineSingletons = coroutineSingletons3;
            z4 = z7;
            interfaceC3055gy2 = interfaceC3055gy;
            r13 = z;
            obj3 = null;
            C2465a.m9358a(c2465a, i4, str8, str4, str9, str12, i5, str13, lessonInfo2.f19371g, zMo8231E0);
        }
        if (lessonInfo == null || str == null || vk9.m23391n0(str) || zMo8231E0 || !(interfaceC3055gy2 == null || (interfaceC3055gy2 instanceof C3018fy))) {
            z4 = z2;
            obj3 = obj2;
            r13 = z3;
            coroutineSingletons2 = coroutineSingletons;
            interfaceC3812yx2 = interfaceC3812yx;
            r6 = r13;
            str2 = str;
            interfaceC3055gy3 = interfaceC3055gy2;
            r11 = z4;
            r12 = obj3;
            if (((Boolean) c3244l.getValue()).booleanValue()) {
                if (interfaceC3055gy3 instanceof C0790ay) {
                    r5 = c3244l;
                    if (interfaceC3055gy3 instanceof C2944dy) {
                        Boolean bool = Boolean.FALSE;
                        r5.getClass();
                        r5.m15572j(r12, bool);
                    }
                } else if (interfaceC3812yx2.mo8231E0(c2465a.f29786t)) {
                    Boolean bool2 = Boolean.FALSE;
                    c3244l.getClass();
                    c3244l.m15572j(r12, bool2);
                    c2465a.m9364g();
                    c2465a.f29767a.m8446I(c2465a.f29786t, true);
                } else if (str2 != null && !vk9.m23391n0(str2)) {
                    DownloadItem downloadItem = new DownloadItem(c2465a.f29787u, c2465a.f29786t, str2);
                    this.f29751g = r12;
                    this.f29745a = r12;
                    this.f29746b = r12;
                    this.f29747c = zMo8231E0;
                    this.f29748d = r11;
                    this.f29749e = r6;
                    this.f29750f = 2;
                }
            }
            return xfa.f68157a;
        }
        DownloadItem downloadItem2 = new DownloadItem(c2465a.f29787u, c2465a.f29786t, str);
        this.f29751g = obj3;
        this.f29745a = interfaceC3055gy2;
        this.f29746b = str;
        this.f29747c = zMo8231E0;
        this.f29748d = z4 ? 1 : 0;
        this.f29749e = r13;
        this.f29750f = 1;
        interfaceC3812yx2 = interfaceC3812yx;
        coroutineSingletons2 = coroutineSingletons;
        if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons2) {
            z5 = zMo8231E0;
            r2 = r13;
            str3 = str;
            interfaceC3055gy4 = interfaceC3055gy2;
            r14 = z4;
            obj4 = obj3;
        }
        return coroutineSingletons2;
        zMo8231E0 = z5;
        str2 = str3;
        r6 = r2;
        interfaceC3055gy3 = interfaceC3055gy4;
        r11 = r14;
        r12 = obj4;
        if (((Boolean) c3244l.getValue()).booleanValue()) {
            if (interfaceC3055gy3 instanceof C0790ay) {
                r5 = c3244l;
                if (interfaceC3055gy3 instanceof C2944dy) {
                    Boolean bool3 = Boolean.FALSE;
                    r5.getClass();
                    r5.m15572j(r12, bool3);
                }
            } else if (interfaceC3812yx2.mo8231E0(c2465a.f29786t)) {
                Boolean bool4 = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(r12, bool4);
                c2465a.m9364g();
                c2465a.f29767a.m8446I(c2465a.f29786t, true);
            } else if (str2 != null) {
                DownloadItem downloadItem3 = new DownloadItem(c2465a.f29787u, c2465a.f29786t, str2);
                this.f29751g = r12;
                this.f29745a = r12;
                this.f29746b = r12;
                this.f29747c = zMo8231E0;
                this.f29748d = r11;
                this.f29749e = r6;
                this.f29750f = 2;
            }
        }
        return xfa.f68157a;
    }
}
