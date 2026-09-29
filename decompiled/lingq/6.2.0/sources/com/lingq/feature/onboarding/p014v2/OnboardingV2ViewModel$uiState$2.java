package com.lingq.feature.onboarding.p014v2;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.eda;
import p000.gm5;
import p000.lx6;
import p000.px6;
import p000.qx6;
import p000.ru6;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$uiState$2", m4291f = "OnboardingV2ViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$uiState$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ px6 f27345a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f27346b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f27347c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f27348d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2216d f27349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$uiState$2(C2216d c2216d, Continuation continuation) {
        super(5, continuation);
        this.f27349e = c2216d;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        OnboardingV2ViewModel$uiState$2 onboardingV2ViewModel$uiState$2 = new OnboardingV2ViewModel$uiState$2(this.f27349e, (Continuation) obj5);
        onboardingV2ViewModel$uiState$2.f27345a = (px6) obj;
        onboardingV2ViewModel$uiState$2.f27346b = zBooleanValue;
        onboardingV2ViewModel$uiState$2.f27347c = zBooleanValue2;
        onboardingV2ViewModel$uiState$2.f27348d = zBooleanValue3;
        return onboardingV2ViewModel$uiState$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zM23391n0;
        px6 px6Var = this.f27345a;
        boolean z = this.f27346b;
        boolean z2 = this.f27347c;
        boolean z3 = this.f27348d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = px6Var.f56945a;
        OnboardingSelections onboardingSelections = px6Var.f56946b;
        String str = onboardingSelections.f27289a;
        String str2 = onboardingSelections.f27292d;
        C2216d c2216d = this.f27349e;
        ArrayList arrayListM9166X2 = c2216d.m9166X2(str, str2, z, z2);
        OnboardingSelections onboardingSelections2 = px6Var.f56946b;
        int i2 = px6Var.f56945a;
        OnboardingPage.Companion.getClass();
        boolean zM9152b = true;
        switch (qx6.f58336a[ru6.m20820a(i2).ordinal()]) {
            case 1:
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 25:
            case 26:
            case 28:
            case 34:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case eda.f37086g /* 48 */:
            case 49:
            case 50:
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 2:
                if (onboardingSelections2.f27289a.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 3:
                if (onboardingSelections2.f27290b.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 4:
                if (onboardingSelections2.f27299k.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 5:
                zM23391n0 = vk9.m23391n0(onboardingSelections2.f27300l);
                zM9152b = true ^ zM23391n0;
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 7:
                if (onboardingSelections2.f27291c.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 8:
                if (onboardingSelections2.f27301m.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 9:
                if (onboardingSelections2.f27302n.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 11:
                if (onboardingSelections2.f27292d.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 15:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.FirstTime.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 16:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.KnowAFewWords.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 17:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.TriedReadingListening.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 18:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.UnderstandSimpleConversations.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 19:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.ConversationsFamiliarTopics.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 20:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.UnderstandArticlesMainIdea.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 21:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.FollowNativeSpeakers.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 22:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.ShowsSlangAccentsChallenge.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                zM9152b = onboardingSelections2.m9152b(OnboardingYesNoQuestion.UnderstandComplexArticles.getSlug());
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 24:
                if (onboardingSelections2.f27294f.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zM23391n0 = onboardingSelections2.f27293e.isEmpty();
                zM9152b = true ^ zM23391n0;
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 29:
                zM23391n0 = onboardingSelections2.f27295g.isEmpty();
                zM9152b = true ^ zM23391n0;
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 30:
                if (onboardingSelections2.f27296h.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                if (onboardingSelections2.f27297i.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 32:
                if (onboardingSelections2.f27304p.length() <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 33:
                if (onboardingSelections2.f27298j <= 0) {
                    zM9152b = false;
                }
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            case 47:
                zM9152b = false;
                return new lx6(i, arrayListM9166X2, onboardingSelections2, zM9152b, px6Var.f56947c, px6Var.f56948d, px6Var.f56949e, c2216d.f27367E, z3);
            default:
                gm5.m12750e();
                return null;
        }
    }
}
