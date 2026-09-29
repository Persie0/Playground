package com.lingq.p020ui;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.user.ProfileSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.km7;
import p000.lda;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$shouldShowBetaLanguageDialog$2", m4291f = "HomeViewModel.kt", m4292l = {330, 332, 359}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$shouldShowBetaLanguageDialog$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$shouldShowBetaLanguageDialog$2(C2888d c2888d, String str, Continuation continuation) {
        super(2, continuation);
        this.f33984b = c2888d;
        this.f33985c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$shouldShowBetaLanguageDialog$2(this.f33984b, this.f33985c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$shouldShowBetaLanguageDialog$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:105:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:106:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:110:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:112:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:117:0x0d01 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:30:0x0172  */
    /* JADX WARN: Code duplicated, block: B:33:0x017c  */
    /* JADX WARN: Code duplicated, block: B:34:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0203  */
    /* JADX WARN: Code duplicated, block: B:38:0x027f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0289  */
    /* JADX WARN: Code duplicated, block: B:42:0x0306  */
    /* JADX WARN: Code duplicated, block: B:45:0x0310  */
    /* JADX WARN: Code duplicated, block: B:46:0x038d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0397  */
    /* JADX WARN: Code duplicated, block: B:50:0x0414  */
    /* JADX WARN: Code duplicated, block: B:53:0x041e  */
    /* JADX WARN: Code duplicated, block: B:54:0x049a  */
    /* JADX WARN: Code duplicated, block: B:57:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0521  */
    /* JADX WARN: Code duplicated, block: B:61:0x052b  */
    /* JADX WARN: Code duplicated, block: B:62:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x062d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0637  */
    /* JADX WARN: Code duplicated, block: B:70:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x06be  */
    /* JADX WARN: Code duplicated, block: B:74:0x073a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0744  */
    /* JADX WARN: Code duplicated, block: B:78:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x0847  */
    /* JADX WARN: Code duplicated, block: B:85:0x0851  */
    /* JADX WARN: Code duplicated, block: B:86:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0953  */
    /* JADX WARN: Code duplicated, block: B:93:0x095d  */
    /* JADX WARN: Code duplicated, block: B:94:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0a60  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        ProfileSettings profileSettings;
        C2888d c2888d = this.f33984b;
        si7 si7Var = c2888d.f34178m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33983a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f33985c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7869b = ((C1368a) si7Var).m7869b();
            this.f33983a = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7869b, this);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM15541t = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        switch (str) {
            case "af":
                profileSettings = new ProfileSettings(lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, 16777215);
                break;
            case "be":
                profileSettings = new ProfileSettings(null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, -1, 16777215);
                break;
            case "bg":
                profileSettings = new ProfileSettings(null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, 16777215);
                break;
            case "eo":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, 16777215);
                break;
            case "ga":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, -1, 16777215);
                break;
            case "gu":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 16777215);
                break;
            case "hi":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, 16777215);
                break;
            case "hu":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, -1, 16777215);
                break;
            case "hy":
                profileSettings = new ProfileSettings(null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, 16777215);
                break;
            case "is":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, 16777215);
                break;
            case "ka":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, 16777215);
                break;
            case "km":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, -1, 16777215);
                break;
            case "mk":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 16777215);
                break;
            case "ms":
                profileSettings = new ProfileSettings(null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, -1, 16777215);
                break;
            case "pa":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, -1, 16777215);
                break;
            case "sk":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, 16777215);
                break;
            case "sl":
                profileSettings = new ProfileSettings(null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 16777215);
                break;
            case "sw":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, -1, 16777215);
                break;
            case "th":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, -1, 16777215);
                break;
            case "tl":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, -1, 16777215);
                break;
            case "ur":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, 16777215);
                break;
            case "vi":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, 16777215);
                break;
            case "hrv":
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, 16777215);
                break;
            default:
                profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                break;
        }
        km7 km7Var = c2888d.f34170e;
        this.f33983a = 3;
        ((C1267a) km7Var).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(str, lda.m16120f(false));
        this.f33983a = 2;
        if (((C1368a) si7Var).m7883i(linkedHashMapM15372Y, this) != coroutineSingletons) {
            switch (str) {
                case 3109:
                    if (str.equals("af")) {
                        profileSettings = new ProfileSettings(lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3139:
                    if (str.equals("be")) {
                        profileSettings = new ProfileSettings(null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3141:
                    if (str.equals("bg")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3242:
                    if (str.equals("eo")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3290:
                    if (str.equals("ga")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3310:
                    if (str.equals("gu")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3329:
                    if (str.equals("hi")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3341:
                    if (str.equals("hu")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3345:
                    if (str.equals("hy")) {
                        profileSettings = new ProfileSettings(null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3370:
                    if (str.equals("is")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3414:
                    if (str.equals("ka")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3426:
                    if (str.equals("km")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3486:
                    if (str.equals("mk")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3494:
                    if (str.equals("ms")) {
                        profileSettings = new ProfileSettings(null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3569:
                    if (str.equals("pa")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3672:
                    if (str.equals("sk")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3673:
                    if (str.equals("sl")) {
                        profileSettings = new ProfileSettings(null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3684:
                    if (str.equals("sw")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3700:
                    if (str.equals("th")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3704:
                    if (str.equals("tl")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3741:
                    if (str.equals("ur")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 3763:
                    if (str.equals("vi")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                case 103596:
                    if (str.equals("hrv")) {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, lda.m16120f(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, 16777215);
                    } else {
                        profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    }
                    break;
                default:
                    profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215);
                    break;
            }
            km7 km7Var2 = c2888d.f34170e;
            this.f33983a = 3;
            ((C1267a) km7Var2).m7061B(profileSettings);
            if (xfaVar != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
