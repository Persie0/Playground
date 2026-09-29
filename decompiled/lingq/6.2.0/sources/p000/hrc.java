package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LanguageProgressChartEntryEntity;
import com.lingq.core.network.api.result.ResultLanguageProgressChartEntry;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hrc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42850a = new C0282a(-37650793, false, new ge1(21));

    /* JADX INFO: renamed from: b */
    public static final C0282a f42851b = new C0282a(-900064128, false, new ge1(22));

    /* JADX INFO: renamed from: c */
    public static final C0282a f42852c = new C0282a(176028349, false, new he1(3));

    /* JADX INFO: renamed from: a */
    public static final LanguageProgressChartEntryEntity m13442a(ResultLanguageProgressChartEntry resultLanguageProgressChartEntry, String str, String str2, String str3, int i) {
        resultLanguageProgressChartEntry.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new LanguageProgressChartEntryEntity(str, str3, str2, resultLanguageProgressChartEntry.f20911a, resultLanguageProgressChartEntry.f20912b, resultLanguageProgressChartEntry.f20913c, i);
    }
}
