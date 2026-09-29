package com.lingq.feature.vocabulary.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.LanguageLearn;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ax2;
import p000.fa4;
import p000.gm5;
import p000.hm5;
import p000.q99;
import p000.r99;
import p000.s99;
import p000.t99;
import p000.u0b;
import p000.u91;
import p000.u99;
import p000.um5;
import p000.v99;
import p000.vm5;
import p000.w99;
import p000.wm5;
import p000.x99;
import p000.xm5;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2825a {
    private static final ax2 Companion = new ax2();

    /* JADX INFO: renamed from: a */
    public final u0b f33568a;

    /* JADX INFO: renamed from: b */
    public final hm5 f33569b;

    public C2825a(u0b u0bVar, hm5 hm5Var) {
        u0bVar.getClass();
        hm5Var.getClass();
        this.f33568a = u0bVar;
        this.f33569b = hm5Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9745a(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Japanese.getCode()) || str.equals(LanguageLearn.Mandarin.getCode()) || str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals(LanguageLearn.Cantonese.getCode());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m9746b(String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        ExportVocabularyCardsUseCase$toSkritter$1 exportVocabularyCardsUseCase$toSkritter$1;
        Object um5Var;
        Bundle bundleM7022c;
        w99 w99Var;
        String str2;
        if (continuationImpl instanceof ExportVocabularyCardsUseCase$toSkritter$1) {
            exportVocabularyCardsUseCase$toSkritter$1 = (ExportVocabularyCardsUseCase$toSkritter$1) continuationImpl;
            int i = exportVocabularyCardsUseCase$toSkritter$1.f33536c;
            if ((i & Integer.MIN_VALUE) != 0) {
                exportVocabularyCardsUseCase$toSkritter$1.f33536c = i - Integer.MIN_VALUE;
            } else {
                exportVocabularyCardsUseCase$toSkritter$1 = new ExportVocabularyCardsUseCase$toSkritter$1(this, continuationImpl);
            }
        } else {
            exportVocabularyCardsUseCase$toSkritter$1 = new ExportVocabularyCardsUseCase$toSkritter$1(this, continuationImpl);
        }
        Object objM7411e = exportVocabularyCardsUseCase$toSkritter$1.f33534a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = exportVocabularyCardsUseCase$toSkritter$1.f33536c;
        u99 u99Var = u99.f63620a;
        s99 s99Var = s99.f60564a;
        v99 v99Var = v99.f65082a;
        hm5 hm5Var = this.f33569b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7411e);
            C1240a c1240a = (C1240a) hm5Var;
            c1240a.m7025f("Skritter vocabulary export selected", c1240a.m7022c("Language", str));
            List listM22583A0 = u91.m22583A0(arrayList);
            if (!m9745a(str)) {
                um5Var = new um5(v99Var);
            } else if (listM22583A0.isEmpty()) {
                um5Var = new um5(s99Var);
            } else if (listM22583A0.size() > 200) {
                um5Var = new um5(u99Var);
            } else {
                exportVocabularyCardsUseCase$toSkritter$1.f33536c = 1;
                objM7411e = ((C1308x) this.f33568a).m7411e(str, listM22583A0, exportVocabularyCardsUseCase$toSkritter$1);
                if (objM7411e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (um5Var instanceof xm5) {
                x99 x99Var = (x99) ((xm5) um5Var).f68348a;
                bundleM7022c = ((C1240a) hm5Var).m7022c("result", "success", "added count", String.valueOf(x99Var.f67980a), "skipped count", String.valueOf(x99Var.f67981b));
            } else if (um5Var instanceof um5) {
                w99Var = (w99) ((um5) um5Var).f64075a;
                if (fa4.m11650l(w99Var, t99.f62024a)) {
                    str2 = "not_connected";
                } else if (fa4.m11650l(w99Var, q99.f57482a)) {
                    str2 = "auth_expired";
                } else if (fa4.m11650l(w99Var, s99Var)) {
                    str2 = "no_cards";
                } else if (fa4.m11650l(w99Var, u99Var)) {
                    str2 = "too_many_cards";
                } else if (fa4.m11650l(w99Var, v99Var)) {
                    str2 = "unsupported_language";
                } else {
                    if (fa4.m11650l(w99Var, r99.f58948a)) {
                        gm5.m12750e();
                        return null;
                    }
                    str2 = "failed";
                }
                bundleM7022c = ((C1240a) hm5Var).m7022c("result", str2);
            } else if (um5Var instanceof vm5) {
                bundleM7022c = ((C1240a) hm5Var).m7022c("result", "loading");
            } else {
                if (fa4.m11650l(um5Var, wm5.f67054a)) {
                    gm5.m12750e();
                    return null;
                }
                bundleM7022c = ((C1240a) hm5Var).m7022c("result", "nonexistent");
            }
            ((C1240a) hm5Var).m7025f("Skritter vocabulary export result", bundleM7022c);
            return um5Var;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM7411e);
        um5Var = (ym5) objM7411e;
        if (um5Var instanceof xm5) {
            x99 x99Var2 = (x99) ((xm5) um5Var).f68348a;
            bundleM7022c = ((C1240a) hm5Var).m7022c("result", "success", "added count", String.valueOf(x99Var2.f67980a), "skipped count", String.valueOf(x99Var2.f67981b));
        } else if (um5Var instanceof um5) {
            w99Var = (w99) ((um5) um5Var).f64075a;
            if (fa4.m11650l(w99Var, t99.f62024a)) {
                str2 = "not_connected";
            } else if (fa4.m11650l(w99Var, q99.f57482a)) {
                str2 = "auth_expired";
            } else if (fa4.m11650l(w99Var, s99Var)) {
                str2 = "no_cards";
            } else if (fa4.m11650l(w99Var, u99Var)) {
                str2 = "too_many_cards";
            } else if (fa4.m11650l(w99Var, v99Var)) {
                str2 = "unsupported_language";
            } else {
                if (fa4.m11650l(w99Var, r99.f58948a)) {
                    gm5.m12750e();
                    return null;
                }
                str2 = "failed";
            }
            bundleM7022c = ((C1240a) hm5Var).m7022c("result", str2);
        } else if (um5Var instanceof vm5) {
            bundleM7022c = ((C1240a) hm5Var).m7022c("result", "loading");
        } else {
            if (fa4.m11650l(um5Var, wm5.f67054a)) {
                gm5.m12750e();
                return null;
            }
            bundleM7022c = ((C1240a) hm5Var).m7022c("result", "nonexistent");
        }
        ((C1240a) hm5Var).m7025f("Skritter vocabulary export result", bundleM7022c);
        return um5Var;
    }
}
