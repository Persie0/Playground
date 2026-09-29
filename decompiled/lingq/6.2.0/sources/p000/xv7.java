package p000;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xv7 {
    /* JADX INFO: renamed from: a */
    public static ReaderFont m24710a(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = ReaderFont.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ReaderFont readerFont = (ReaderFont) next;
            if (readerFont.getLanguages().contains(str) && bq1.m4058i0(readerFont)) {
                break;
            }
        }
        ReaderFont readerFont2 = (ReaderFont) next;
        return readerFont2 == null ? ReaderFont.DmSans : readerFont2;
    }

    /* JADX INFO: renamed from: b */
    public static ReaderFont m24711b(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = ReaderFont.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!bq1.m4057h0((ReaderFont) next).equals(str));
        ReaderFont readerFont = (ReaderFont) next;
        return readerFont == null ? ReaderFont.System : readerFont;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m24712c(String str) {
        str.getClass();
        ys2 entries = ReaderFont.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            ReaderFont readerFont = (ReaderFont) obj;
            if ((str.equals(LanguageLearn.Japanese.getCode()) || str.equals(LanguageLearn.Arabic.getCode()) || str.equals(LanguageLearn.Farsi.getCode()) || str.equals(LanguageLearn.Mandarin.getCode()) || str.equals(LanguageLearn.Cantonese.getCode()) || str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals(LanguageLearn.Korean.getCode())) ? readerFont.getLanguages().contains(str) : readerFont.getLanguages().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
