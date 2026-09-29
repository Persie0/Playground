package com.lingq.core.domain.library;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.fa4;
import p000.si7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.library.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1386a {

    /* JADX INFO: renamed from: a */
    public final si7 f18830a;

    public C1386a(si7 si7Var, int i) {
        si7Var.getClass();
        switch (i) {
            case 1:
                this.f18830a = si7Var;
                break;
            case 2:
                this.f18830a = si7Var;
                break;
            case 3:
                this.f18830a = si7Var;
                break;
            default:
                this.f18830a = si7Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m7997a(Language language) {
        language.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15521C(((C1368a) this.f18830a).f18458w1, new GetBetaWarningUseCase$invoke$1(language, null)));
    }

    /* JADX INFO: renamed from: b */
    public c83 m7998b(String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15546y(((C1368a) this.f18830a).f18407f1, new GetPreferredLearningLevels$invoke$1(str, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r6).m7907u(r7, r0) == r1) goto L24;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m7999c(LibraryShelf libraryShelf, LibraryTab libraryTab, ContinuationImpl continuationImpl) throws Throwable {
        UpdatePreferredTabForShelfUseCase$invoke$1 updatePreferredTabForShelfUseCase$invoke$1;
        if (continuationImpl instanceof UpdatePreferredTabForShelfUseCase$invoke$1) {
            updatePreferredTabForShelfUseCase$invoke$1 = (UpdatePreferredTabForShelfUseCase$invoke$1) continuationImpl;
            int i = updatePreferredTabForShelfUseCase$invoke$1.f18825e;
            if ((i & Integer.MIN_VALUE) != 0) {
                updatePreferredTabForShelfUseCase$invoke$1.f18825e = i - Integer.MIN_VALUE;
            } else {
                updatePreferredTabForShelfUseCase$invoke$1 = new UpdatePreferredTabForShelfUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updatePreferredTabForShelfUseCase$invoke$1 = new UpdatePreferredTabForShelfUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15542u = updatePreferredTabForShelfUseCase$invoke$1.f18823c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updatePreferredTabForShelfUseCase$invoke$1.f18825e;
        si7 si7Var = this.f18830a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15542u);
            c83 c83Var = ((C1368a) si7Var).f18330C1;
            updatePreferredTabForShelfUseCase$invoke$1.f18821a = libraryShelf;
            updatePreferredTabForShelfUseCase$invoke$1.f18822b = libraryTab;
            updatePreferredTabForShelfUseCase$invoke$1.f18825e = 1;
            objM15542u = AbstractC3224d.m15542u(c83Var, updatePreferredTabForShelfUseCase$invoke$1);
            if (objM15542u != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            libraryTab = updatePreferredTabForShelfUseCase$invoke$1.f18822b;
            libraryShelf = updatePreferredTabForShelfUseCase$invoke$1.f18821a;
            AbstractC3193b.m15359b(objM15542u);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15542u);
        }
        return xfa.f68157a;
        Map mapM15360M = (Map) objM15542u;
        if (mapM15360M == null) {
            mapM15360M = AbstractC3194a.m15360M();
        }
        Map mapM15368U = AbstractC3194a.m15368U(mapM15360M, new Pair(libraryShelf.f19496d, libraryTab.f19506f));
        updatePreferredTabForShelfUseCase$invoke$1.f18821a = null;
        updatePreferredTabForShelfUseCase$invoke$1.f18822b = null;
        updatePreferredTabForShelfUseCase$invoke$1.f18825e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m8000d(String str, ContinuationImpl continuationImpl) throws Throwable {
        ShouldShowBetaLanguageWarningUseCase$invoke$1 shouldShowBetaLanguageWarningUseCase$invoke$1;
        if (continuationImpl instanceof ShouldShowBetaLanguageWarningUseCase$invoke$1) {
            shouldShowBetaLanguageWarningUseCase$invoke$1 = (ShouldShowBetaLanguageWarningUseCase$invoke$1) continuationImpl;
            int i = shouldShowBetaLanguageWarningUseCase$invoke$1.f18820d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shouldShowBetaLanguageWarningUseCase$invoke$1.f18820d = i - Integer.MIN_VALUE;
            } else {
                shouldShowBetaLanguageWarningUseCase$invoke$1 = new ShouldShowBetaLanguageWarningUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            shouldShowBetaLanguageWarningUseCase$invoke$1 = new ShouldShowBetaLanguageWarningUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = shouldShowBetaLanguageWarningUseCase$invoke$1.f18818b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shouldShowBetaLanguageWarningUseCase$invoke$1.f18820d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1368a) this.f18830a).f18458w1;
            shouldShowBetaLanguageWarningUseCase$invoke$1.f18817a = str;
            shouldShowBetaLanguageWarningUseCase$invoke$1.f18820d = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, shouldShowBetaLanguageWarningUseCase$invoke$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = shouldShowBetaLanguageWarningUseCase$invoke$1.f18817a;
            AbstractC3193b.m15359b(objM15541t);
        }
        return Boolean.valueOf(fa4.m11650l(((Map) objM15541t).get(str), Boolean.TRUE));
    }
}
