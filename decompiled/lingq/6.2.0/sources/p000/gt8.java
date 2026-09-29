package p000;

import com.lingq.feature.search.filter.model.FilterType;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class gt8 {

    /* JADX INFO: renamed from: a */
    public final boolean f41302a;

    /* JADX INFO: renamed from: b */
    public final d1d f41303b;

    /* JADX INFO: renamed from: c */
    public final jq8 f41304c;

    /* JADX INFO: renamed from: d */
    public final gq8 f41305d;

    /* JADX INFO: renamed from: e */
    public final FilterType f41306e;

    public /* synthetic */ gt8() {
        this(false, et8.f37830a, new jq8(EmptyList.f47638a), new gq8(), null);
    }

    /* JADX INFO: renamed from: a */
    public static gt8 m12861a(gt8 gt8Var, boolean z, d1d d1dVar, jq8 jq8Var, gq8 gq8Var, FilterType filterType, int i) {
        if ((i & 1) != 0) {
            z = gt8Var.f41302a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            d1dVar = gt8Var.f41303b;
        }
        d1d d1dVar2 = d1dVar;
        if ((i & 4) != 0) {
            jq8Var = gt8Var.f41304c;
        }
        jq8 jq8Var2 = jq8Var;
        if ((i & 8) != 0) {
            gq8Var = gt8Var.f41305d;
        }
        gq8 gq8Var2 = gq8Var;
        if ((i & 16) != 0) {
            filterType = gt8Var.f41306e;
        }
        gt8Var.getClass();
        d1dVar2.getClass();
        jq8Var2.getClass();
        gq8Var2.getClass();
        return new gt8(z2, d1dVar2, jq8Var2, gq8Var2, filterType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt8)) {
            return false;
        }
        gt8 gt8Var = (gt8) obj;
        return this.f41302a == gt8Var.f41302a && fa4.m11650l(this.f41303b, gt8Var.f41303b) && fa4.m11650l(this.f41304c, gt8Var.f41304c) && fa4.m11650l(this.f41305d, gt8Var.f41305d) && this.f41306e == gt8Var.f41306e;
    }

    public final int hashCode() {
        int iHashCode = (this.f41305d.hashCode() + ux5.m22979b((this.f41303b.hashCode() + (Boolean.hashCode(this.f41302a) * 31)) * 31, 31, this.f41304c.f46012a)) * 31;
        FilterType filterType = this.f41306e;
        return iHashCode + (filterType == null ? 0 : filterType.hashCode());
    }

    public final String toString() {
        return "SearchSettingsBottomSheetState(isVisible=" + this.f41302a + ", page=" + this.f41303b + ", filterState=" + this.f41304c + ", selectionState=" + this.f41305d + ", selectedFilterType=" + this.f41306e + ")";
    }

    public gt8(boolean z, d1d d1dVar, jq8 jq8Var, gq8 gq8Var, FilterType filterType) {
        this.f41302a = z;
        this.f41303b = d1dVar;
        this.f41304c = jq8Var;
        this.f41305d = gq8Var;
        this.f41306e = filterType;
    }
}
