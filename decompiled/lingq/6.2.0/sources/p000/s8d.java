package p000;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.p012ui.R$string;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s8d {
    /* JADX INFO: renamed from: a */
    public static final List m21155a(String str) {
        str.getClass();
        if (str.equals(LanguageLearn.Japanese.getCode())) {
            return vz1.m23605K(new aba(R$string.settings_asian_romaji, "Romaji"), new aba(R$string.settings_asian_hiragana, "Hiragana"), new aba(R$string.settings_asian_furigana, "Furigana"), new aba(R$string.settings_asian_no_transliteration, "Off"));
        }
        if (str.equals(LanguageLearn.Mandarin.getCode())) {
            return vz1.m23605K(new aba(R$string.settings_asian_pinyin, "Pinyin"), new aba(R$string.settings_asian_traditional, "Traditional"), new aba(R$string.settings_asian_no_transliteration, "Off"));
        }
        if (str.equals(LanguageLearn.ChineseTraditional.getCode())) {
            return vz1.m23605K(new aba(R$string.settings_asian_pinyin, "Pinyin"), new aba(R$string.settings_asian_simplified, "Simplified"), new aba(R$string.settings_asian_no_transliteration, "Off"));
        }
        if (str.equals(LanguageLearn.Cantonese.getCode())) {
            return vz1.m23605K(new aba(R$string.settings_asian_jyutping, "Jyutping"), new aba(R$string.settings_asian_simplified, "Simplified"), new aba(R$string.settings_asian_no_transliteration, "Off"));
        }
        return AbstractC3184kh.m15230y(str) ? vz1.m23605K(new aba(R$string.settings_latin, "Latin"), new aba(R$string.settings_asian_no_transliteration, "Off")) : EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m21156b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    /* JADX INFO: renamed from: c */
    public static ViewStructure m21157c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    /* JADX INFO: renamed from: d */
    public static void m21158d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* JADX INFO: renamed from: e */
    public static void m21159e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    /* JADX INFO: renamed from: f */
    public static void m21160f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m21161g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }
}
