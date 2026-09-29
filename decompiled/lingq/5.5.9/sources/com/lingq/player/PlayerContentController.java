package com.lingq.player;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerContentController {

    /* JADX INFO: renamed from: a */
    public final ArrayList f17596a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f17597b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f17598c;

    /* JADX INFO: renamed from: d */
    public int f17599d;

    @InterfaceC9307k(generateAdapter = true)
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final /* data */ class PlayerContentItem {

        /* JADX INFO: renamed from: a */
        public final int f17600a;

        /* JADX INFO: renamed from: b */
        public final String f17601b;

        /* JADX INFO: renamed from: c */
        public final String f17602c;

        /* JADX INFO: renamed from: d */
        public final String f17603d;

        /* JADX INFO: renamed from: e */
        public final int f17604e;

        /* JADX INFO: renamed from: f */
        public final String f17605f;

        /* JADX INFO: renamed from: g */
        public final boolean f17606g;

        /* JADX INFO: renamed from: h */
        public final int f17607h;

        /* JADX INFO: renamed from: i */
        public final String f17608i;

        /* JADX INFO: renamed from: j */
        public final AbstractC3299d f17609j;

        public PlayerContentItem(int i10, String str, String str2, String str3, int i11, String str4, boolean z10, int i12, String str5, AbstractC3299d abstractC3299d) {
            C5207g.m11111f(str, "audio");
            C5207g.m11111f(str2, "lessonTitle");
            C5207g.m11111f(str3, "courseTitle");
            C5207g.m11111f(str4, "imageUrl");
            C5207g.m11111f(str5, "language");
            C5207g.m11111f(abstractC3299d, "inPlaylistType");
            this.f17600a = i10;
            this.f17601b = str;
            this.f17602c = str2;
            this.f17603d = str3;
            this.f17604e = i11;
            this.f17605f = str4;
            this.f17606g = z10;
            this.f17607h = i12;
            this.f17608i = str5;
            this.f17609j = abstractC3299d;
        }

        public /* synthetic */ PlayerContentItem(int i10, String str, String str2, String str3, int i11, String str4, boolean z10, int i12, String str5, AbstractC3299d abstractC3299d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, str2, str3, i11, str4, z10, i12, str5, (i13 & 512) != 0 ? AbstractC3299d.b.f17755a : abstractC3299d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayerContentItem)) {
                return false;
            }
            PlayerContentItem playerContentItem = (PlayerContentItem) obj;
            if (this.f17600a == playerContentItem.f17600a && C5207g.m11106a(this.f17601b, playerContentItem.f17601b) && C5207g.m11106a(this.f17602c, playerContentItem.f17602c) && C5207g.m11106a(this.f17603d, playerContentItem.f17603d) && this.f17604e == playerContentItem.f17604e && C5207g.m11106a(this.f17605f, playerContentItem.f17605f) && this.f17606g == playerContentItem.f17606g && this.f17607h == playerContentItem.f17607h && C5207g.m11106a(this.f17608i, playerContentItem.f17608i) && C5207g.m11106a(this.f17609j, playerContentItem.f17609j)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f17605f, C0009a.m16d(this.f17604e, C0166e.m758d(this.f17603d, C0166e.m758d(this.f17602c, C0166e.m758d(this.f17601b, Integer.hashCode(this.f17600a) * 31, 31), 31), 31), 31), 31);
            boolean z10 = this.f17606g;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f17609j.hashCode() + C0166e.m758d(this.f17608i, C0009a.m16d(this.f17607h, (iM758d + r10) * 31, 31), 31);
        }

        public final String toString() {
            return "PlayerContentItem(lessonId=" + this.f17600a + ", audio=" + this.f17601b + ", lessonTitle=" + this.f17602c + ", courseTitle=" + this.f17603d + ", duration=" + this.f17604e + ", imageUrl=" + this.f17605f + ", isDownloaded=" + this.f17606g + ", courseId=" + this.f17607h + ", language=" + this.f17608i + ", inPlaylistType=" + this.f17609j + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public final PlayerContentItem m9389a() {
        ArrayList arrayList = this.f17596a;
        if (arrayList.size() > 0 && this.f17598c < arrayList.size()) {
            return (PlayerContentItem) arrayList.get(this.f17598c);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        this.f17598c = 0;
        return (PlayerContentItem) arrayList.get(0);
    }
}
