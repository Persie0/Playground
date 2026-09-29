package p181ii;

import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.library.SortType;
import dm.C5207g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p385sf.C9000b;

/* JADX INFO: renamed from: ii.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6335d {

    /* JADX INFO: renamed from: ii.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36627a;

        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.New.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortType.MyLessons.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortType.MyCourses.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortType.Collection.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f36627a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List<Sort> m12965a(SortType sortType) {
        C5207g.m11111f(sortType, "<this>");
        int i10 = a.f36627a[sortType.ordinal()];
        if (i10 == 1) {
            return C9000b.m17252r(Sort.Relevance, Sort.Liked, Sort.Oldest, Sort.Newest, Sort.AtoZ, Sort.NewWordsPercent);
        }
        if (i10 == 2 || i10 == 3) {
            return C9000b.m17252r(Sort.RecentlyOpened, Sort.Imported, Sort.Newest, Sort.Oldest, Sort.Incomplete, Sort.Complete, Sort.NewWordsPercent, Sort.AtoZ);
        }
        if (i10 == 4) {
            return C9000b.m17252r(Sort.Position, Sort.RecentlyOpened, Sort.Newest, Sort.Oldest, Sort.NewWordsPercent);
        }
        throw new NoWhenBranchMatchedException();
    }
}
