package p000;

import com.lingq.core.settings.FilterType;
import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes3.dex */
public final class qz7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f58426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x19 f58427c;

    public /* synthetic */ qz7(vi3 vi3Var, x19 x19Var, int i) {
        this.f58425a = i;
        this.f58426b = vi3Var;
        this.f58427c = x19Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f58425a;
        FilterType filterType = null;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f58426b;
        x19 x19Var = this.f58427c;
        switch (i) {
            case 0:
                vi3Var.invoke(new ez7(x19Var.f67648c));
                break;
            case 1:
                vi3Var.invoke(new ff8(x19Var.f67648c));
                break;
            case 2:
                ViewKeys viewKeys = x19Var.f67648c;
                viewKeys.getClass();
                switch (yya.f70656a[viewKeys.ordinal()]) {
                    case 1:
                        filterType = FilterType.SearchTerm;
                        break;
                    case 2:
                        filterType = FilterType.SortBy;
                        break;
                    case 3:
                        filterType = FilterType.Course;
                        break;
                    case 4:
                        filterType = FilterType.Lesson;
                        break;
                    case 5:
                        filterType = FilterType.Tags;
                        break;
                    case 6:
                        filterType = FilterType.SRSDate;
                        break;
                }
                if (filterType != null) {
                    vi3Var.invoke(new zf6(filterType));
                }
                break;
            default:
                switch (sza.f61682a[x19Var.f67648c.ordinal()]) {
                    case 1:
                        filterType = FilterType.SearchTerm;
                        break;
                    case 2:
                        filterType = FilterType.SortBy;
                        break;
                    case 3:
                        filterType = FilterType.Course;
                        break;
                    case 4:
                        filterType = FilterType.Lesson;
                        break;
                    case 5:
                        filterType = FilterType.Tags;
                        break;
                    case 6:
                        filterType = FilterType.SRSDate;
                        break;
                }
                if (filterType != null) {
                    vi3Var.invoke(new kza(filterType));
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ qz7(x19 x19Var, vi3 vi3Var, int i) {
        this.f58425a = i;
        this.f58427c = x19Var;
        this.f58426b = vi3Var;
    }
}
