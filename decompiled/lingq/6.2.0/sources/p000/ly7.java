package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ly7 {

    /* JADX INFO: renamed from: a */
    public final boolean f50307a;

    /* JADX INFO: renamed from: b */
    public final float f50308b;

    /* JADX INFO: renamed from: c */
    public final float f50309c;

    /* JADX INFO: renamed from: d */
    public final boolean f50310d;

    /* JADX INFO: renamed from: e */
    public final boolean f50311e;

    /* JADX INFO: renamed from: f */
    public final boolean f50312f;

    /* JADX INFO: renamed from: g */
    public final AudioUnderlineMode f50313g;

    /* JADX INFO: renamed from: h */
    public final List f50314h;

    public /* synthetic */ ly7(boolean z, float f, float f2, boolean z2, boolean z3, List list, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? 1.0f : f2, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, false, AudioUnderlineMode.Wave, (i & 128) != 0 ? EmptyList.f47638a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly7)) {
            return false;
        }
        ly7 ly7Var = (ly7) obj;
        return this.f50307a == ly7Var.f50307a && Float.compare(this.f50308b, ly7Var.f50308b) == 0 && Float.compare(this.f50309c, ly7Var.f50309c) == 0 && this.f50310d == ly7Var.f50310d && this.f50311e == ly7Var.f50311e && this.f50312f == ly7Var.f50312f && this.f50313g == ly7Var.f50313g && fa4.m11650l(this.f50314h, ly7Var.f50314h);
    }

    public final int hashCode() {
        return this.f50314h.hashCode() + ((this.f50313g.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(wq1.m24105a(wq1.m24105a(Boolean.hashCode(this.f50307a) * 31, this.f50308b, 31), this.f50309c, 31), 31, this.f50310d), 31, this.f50311e), 31, this.f50312f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderPreferencesState(tapToPage=");
        sb.append(this.f50307a);
        sb.append(", sentencePlaybackSpeed=");
        sb.append(this.f50308b);
        sb.append(", videoPlaybackSpeed=");
        sb.append(this.f50309c);
        sb.append(", sentenceAutoPlayTts=");
        sb.append(this.f50310d);
        sb.append(", showVocabulary=");
        wq1.m24101A(sb, this.f50311e, ", showMergedMeanings=", this.f50312f, ", audioUnderlineMode=");
        sb.append(this.f50313g);
        sb.append(", playbackSpeeds=");
        sb.append(this.f50314h);
        sb.append(")");
        return sb.toString();
    }

    public ly7(boolean z, float f, float f2, boolean z2, boolean z3, boolean z4, AudioUnderlineMode audioUnderlineMode, List list) {
        audioUnderlineMode.getClass();
        list.getClass();
        this.f50307a = z;
        this.f50308b = f;
        this.f50309c = f2;
        this.f50310d = z2;
        this.f50311e = z3;
        this.f50312f = z4;
        this.f50313g = audioUnderlineMode;
        this.f50314h = list;
    }
}
