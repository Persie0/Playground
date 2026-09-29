package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class n1b {

    /* JADX INFO: renamed from: a */
    public final h1b f52191a;

    /* JADX INFO: renamed from: b */
    public final zza f52192b;

    /* JADX INFO: renamed from: c */
    public final h0b f52193c;

    /* JADX INFO: renamed from: d */
    public final r0b f52194d;

    /* JADX INFO: renamed from: e */
    public final w0b f52195e;

    /* JADX INFO: renamed from: f */
    public final boolean f52196f;

    /* JADX INFO: renamed from: g */
    public final boolean f52197g;

    /* JADX INFO: renamed from: h */
    public final boolean f52198h;

    /* JADX INFO: renamed from: i */
    public final boolean f52199i;

    /* JADX INFO: renamed from: j */
    public final lxa f52200j;

    /* JADX INFO: renamed from: k */
    public final kya f52201k;

    public n1b() {
        h1b h1bVar = new h1b("");
        zza zzaVar = new zza(VocabularyContentFilter.All, new Pair(CardStatus.New, CardStatus.Known), 0);
        EmptyList emptyList = EmptyList.f47638a;
        this(h1bVar, zzaVar, new h0b(emptyList, null), new r0b(), new w0b(false, emptyList, ReviewType.VocabularyAll, false), false, false, false, false, null, hya.f43221a);
    }

    /* JADX INFO: renamed from: a */
    public static n1b m17171a(n1b n1bVar, h1b h1bVar, zza zzaVar, h0b h0bVar, r0b r0bVar, w0b w0bVar, boolean z, boolean z2, boolean z3, boolean z4, lxa lxaVar, kya kyaVar, int i) {
        if ((i & 1) != 0) {
            h1bVar = n1bVar.f52191a;
        }
        h1b h1bVar2 = h1bVar;
        if ((i & 2) != 0) {
            zzaVar = n1bVar.f52192b;
        }
        zza zzaVar2 = zzaVar;
        if ((i & 4) != 0) {
            h0bVar = n1bVar.f52193c;
        }
        h0b h0bVar2 = h0bVar;
        r0b r0bVar2 = (i & 8) != 0 ? n1bVar.f52194d : r0bVar;
        w0b w0bVar2 = (i & 16) != 0 ? n1bVar.f52195e : w0bVar;
        boolean z5 = (i & 32) != 0 ? n1bVar.f52196f : z;
        boolean z6 = (i & 64) != 0 ? n1bVar.f52197g : z2;
        boolean z7 = (i & 128) != 0 ? n1bVar.f52198h : z3;
        boolean z8 = (i & 256) != 0 ? n1bVar.f52199i : z4;
        lxa lxaVar2 = (i & 512) != 0 ? n1bVar.f52200j : lxaVar;
        kya kyaVar2 = (i & 1024) != 0 ? n1bVar.f52201k : kyaVar;
        n1bVar.getClass();
        h1bVar2.getClass();
        zzaVar2.getClass();
        h0bVar2.getClass();
        r0bVar2.getClass();
        w0bVar2.getClass();
        kyaVar2.getClass();
        return new n1b(h1bVar2, zzaVar2, h0bVar2, r0bVar2, w0bVar2, z5, z6, z7, z8, lxaVar2, kyaVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1b)) {
            return false;
        }
        n1b n1bVar = (n1b) obj;
        return fa4.m11650l(this.f52191a, n1bVar.f52191a) && fa4.m11650l(this.f52192b, n1bVar.f52192b) && fa4.m11650l(this.f52193c, n1bVar.f52193c) && fa4.m11650l(this.f52194d, n1bVar.f52194d) && fa4.m11650l(this.f52195e, n1bVar.f52195e) && this.f52196f == n1bVar.f52196f && this.f52197g == n1bVar.f52197g && this.f52198h == n1bVar.f52198h && this.f52199i == n1bVar.f52199i && fa4.m11650l(this.f52200j, n1bVar.f52200j) && fa4.m11650l(this.f52201k, n1bVar.f52201k);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f52195e.hashCode() + ((this.f52194d.hashCode() + ((this.f52193c.hashCode() + ((this.f52192b.hashCode() + (this.f52191a.f41665a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f52196f), 31, this.f52197g), 31, this.f52198h), 31, this.f52199i);
        lxa lxaVar = this.f52200j;
        return this.f52201k.hashCode() + ((iM12428e + (lxaVar == null ? 0 : lxaVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VocabularyState(searchState=");
        sb.append(this.f52191a);
        sb.append(", filterState=");
        sb.append(this.f52192b);
        sb.append(", listState=");
        sb.append(this.f52193c);
        sb.append(", pageState=");
        sb.append(this.f52194d);
        sb.append(", reviewState=");
        sb.append(this.f52195e);
        sb.append(", isRefreshing=");
        sb.append(this.f52196f);
        sb.append(", showBlockingLoader=");
        wq1.m24101A(sb, this.f52197g, ", canAddVocabulary=", this.f52198h, ", canExportToSkritter=");
        sb.append(this.f52199i);
        sb.append(", addedTermState=");
        sb.append(this.f52200j);
        sb.append(", exportState=");
        sb.append(this.f52201k);
        sb.append(")");
        return sb.toString();
    }

    public n1b(h1b h1bVar, zza zzaVar, h0b h0bVar, r0b r0bVar, w0b w0bVar, boolean z, boolean z2, boolean z3, boolean z4, lxa lxaVar, kya kyaVar) {
        this.f52191a = h1bVar;
        this.f52192b = zzaVar;
        this.f52193c = h0bVar;
        this.f52194d = r0bVar;
        this.f52195e = w0bVar;
        this.f52196f = z;
        this.f52197g = z2;
        this.f52198h = z3;
        this.f52199i = z4;
        this.f52200j = lxaVar;
        this.f52201k = kyaVar;
    }
}
