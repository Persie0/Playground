package p000;

import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.library.SortType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zjd {
    /* JADX INFO: renamed from: a */
    public static final List m25681a(SortType sortType) {
        sortType.getClass();
        int i = z95.f71225a[sortType.ordinal()];
        if (i == 1) {
            return vz1.m23605K(Sort.Relevance, Sort.Liked, Sort.Oldest, Sort.Newest, Sort.AtoZ, Sort.NewWordsPercent);
        }
        if (i == 2) {
            return vz1.m23605K(Sort.RecentlyOpened, Sort.Imported, Sort.Newest, Sort.Oldest, Sort.Incomplete, Sort.Complete, Sort.NewWordsPercent, Sort.AtoZ);
        }
        if (i == 3) {
            return vz1.m23605K(Sort.RecentlyOpened, Sort.Imported, Sort.Newest, Sort.Oldest, Sort.NewWordsPercent, Sort.AtoZ);
        }
        if (i == 4) {
            return vz1.m23605K(Sort.Position, Sort.RecentlyOpened, Sort.Newest, Sort.Oldest, Sort.NewWordsPercent);
        }
        gm5.m12750e();
        return null;
    }
}
