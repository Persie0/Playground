package p000;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.token.TokenCwt;
import com.lingq.core.domain.token.GetCwtUseCase$forLesson$$inlined$map$1$2$1;
import com.lingq.core.settings.domain.GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.reader.stats.domain.GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.search.fastsearch.C2768b;
import com.lingq.feature.vocabulary.domain.GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: pw */
/* JADX INFO: loaded from: classes2.dex */
public final class C3475pw implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f56884b;

    public C3475pw(e83 e83Var, C2768b c2768b) {
        this.f56883a = 13;
        this.f56884b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    private final Object m19531a(Object obj, Continuation continuation) throws Throwable {
        GetCwtUseCase$forLesson$$inlined$map$1$2$1 getCwtUseCase$forLesson$$inlined$map$1$2$1;
        if (continuation instanceof GetCwtUseCase$forLesson$$inlined$map$1$2$1) {
            getCwtUseCase$forLesson$$inlined$map$1$2$1 = (GetCwtUseCase$forLesson$$inlined$map$1$2$1) continuation;
            int i = getCwtUseCase$forLesson$$inlined$map$1$2$1.f20023b;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCwtUseCase$forLesson$$inlined$map$1$2$1.f20023b = i - Integer.MIN_VALUE;
            } else {
                getCwtUseCase$forLesson$$inlined$map$1$2$1 = new GetCwtUseCase$forLesson$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            getCwtUseCase$forLesson$$inlined$map$1$2$1 = new GetCwtUseCase$forLesson$$inlined$map$1$2$1(this, continuation);
        }
        Object obj2 = getCwtUseCase$forLesson$$inlined$map$1$2$1.f20022a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getCwtUseCase$forLesson$$inlined$map$1$2$1.f20023b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            ArrayList<TokenCwt> arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                if (!vk9.m23391n0(((TokenCwt) obj3).f19587e)) {
                    arrayList.add(obj3);
                }
            }
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayList, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (TokenCwt tokenCwt : arrayList) {
                linkedHashMap.put(new Pair(new Integer(tokenCwt.f19588f), new Integer(tokenCwt.f19589g)), tokenCwt.f19587e);
            }
            getCwtUseCase$forLesson$$inlined$map$1$2$1.f20023b = 1;
            if (this.f56884b.emit(linkedHashMap, getCwtUseCase$forLesson$$inlined$map$1$2$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m19532b(Object obj, Continuation continuation) throws Throwable {
        GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1 getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1;
        if (continuation instanceof GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1) {
            getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1 = (GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1) continuation;
            int i = getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1.f22757b;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1.f22757b = i - Integer.MIN_VALUE;
            } else {
                getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1 = new GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1 = new GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
        }
        Object obj2 = getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1.f22756a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1.f22757b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            Language language = (Language) obj;
            az1 az1Var = language != null ? new az1(language.f19038o, fa4.m11650l(language.f19039p, "on"), fa4.m11650l(language.f19040q, "on")) : null;
            getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1.f22757b = 1;
            if (this.f56884b.emit(az1Var, getDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    private final Object m19533c(Object obj, Continuation continuation) throws Throwable {
        GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1 getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1;
        if (continuation instanceof GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1) {
            getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1 = (GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1) continuation;
            int i = getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1.f33538b;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1.f33538b = i - Integer.MIN_VALUE;
            } else {
                getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1 = new GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1 = new GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
        }
        Object obj2 = getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1.f33537a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1.f33538b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
            getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1.f33538b = 1;
            if (this.f56884b.emit(boolValueOf, getHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    private final Object m19534d(Object obj, Continuation continuation) throws Throwable {
        GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1 getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1;
        if (continuation instanceof GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1) {
            getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1 = (GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1) continuation;
            int i = getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1.f30760b;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1.f30760b = i - Integer.MIN_VALUE;
            } else {
                getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1 = new GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1 = new GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
        }
        Object obj2 = getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1.f30759a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1.f30760b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            nz9 nz9Var = (nz9) obj;
            in5 in5Var = new in5(new kn5(nz9Var.f53455a, nz9Var.f53456b, nz9Var.f53458d, nz9Var.f53461g, nz9Var.f53462h));
            getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1.f30760b = 1;
            if (this.f56884b.emit(in5Var, getLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:126:0x0215  */
    /* JADX WARN: Code duplicated, block: B:141:0x0254  */
    /* JADX WARN: Code duplicated, block: B:158:0x0293  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:192:0x0313  */
    /* JADX WARN: Code duplicated, block: B:207:0x034e  */
    /* JADX WARN: Code duplicated, block: B:278:0x055a  */
    /* JADX WARN: Code duplicated, block: B:301:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:321:0x062d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:357:0x06db  */
    /* JADX WARN: Code duplicated, block: B:398:0x078a  */
    /* JADX WARN: Code duplicated, block: B:399:0x078f  */
    /* JADX WARN: Code duplicated, block: B:401:0x0793  */
    /* JADX WARN: Code duplicated, block: B:402:0x0796  */
    /* JADX WARN: Code duplicated, block: B:404:0x079a  */
    /* JADX WARN: Code duplicated, block: B:405:0x079f  */
    /* JADX WARN: Code duplicated, block: B:409:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:411:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:413:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:414:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:428:0x0808  */
    /* JADX WARN: Code duplicated, block: B:449:0x085c  */
    /* JADX WARN: Code duplicated, block: B:466:0x089f  */
    /* JADX WARN: Code duplicated, block: B:487:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:509:0x0947  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:526:0x0988  */
    /* JADX WARN: Code duplicated, block: B:543:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:649:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x0151  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v12 java.lang.Object, still in use, count: 2, list:
          (r7v12 java.lang.Object) from 0x0782: PHI (r7 I:??) = (r7v6 java.lang.Object), (r7v12 java.lang.Object) binds: [B:395:0x0780, B:646:0x0782] A[DONT_GENERATE, DONT_INLINE]
          (r7v12 java.lang.Object) from 0x0777: CHECK_CAST (java.lang.Number) (r7v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p000.e83
    public final java.lang.Object emit(java.lang.Object r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3475pw.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ C3475pw(e83 e83Var, int i) {
        this.f56883a = i;
        this.f56884b = e83Var;
    }
}
