package p278nh;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.FeedTopic;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: nh.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7789p {

    /* JADX INFO: renamed from: a */
    public final int f42796a;

    /* JADX INFO: renamed from: b */
    public final String f42797b;

    /* JADX INFO: renamed from: c */
    public final String f42798c;

    /* JADX INFO: renamed from: d */
    public boolean f42799d;

    /* JADX INFO: renamed from: nh.p$a */
    public static final class a extends AbstractC7789p {

        /* JADX INFO: renamed from: e */
        public final int f42800e;

        /* JADX INFO: renamed from: f */
        public final String f42801f;

        /* JADX INFO: renamed from: g */
        public final String f42802g;

        /* JADX INFO: renamed from: h */
        public final boolean f42803h;

        /* JADX INFO: renamed from: i */
        public final int f42804i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, String str, String str2, boolean z10) {
            super(str, str2, z10, i10);
            C5207g.m11111f(str, "selectionText");
            C5207g.m11111f(str2, "selectionValue");
            this.f42800e = i10;
            this.f42801f = str;
            this.f42802g = str2;
            this.f42803h = z10;
            this.f42804i = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42800e == aVar.f42800e && C5207g.m11106a(this.f42801f, aVar.f42801f) && C5207g.m11106a(this.f42802g, aVar.f42802g) && this.f42803h == aVar.f42803h && this.f42804i == aVar.f42804i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f42802g, C0166e.m758d(this.f42801f, Integer.hashCode(this.f42800e) * 31, 31), 31);
            boolean z10 = this.f42803h;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Integer.hashCode(this.f42804i) + ((iM758d + r10) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FontDownloadSelection(selectionKey=");
            sb2.append(this.f42800e);
            sb2.append(", selectionText=");
            sb2.append(this.f42801f);
            sb2.append(", selectionValue=");
            sb2.append(this.f42802g);
            sb2.append(", selectionIsSelected=");
            sb2.append(this.f42803h);
            sb2.append(", downloadProgress=");
            return C0166e.m768o(sb2, this.f42804i, ")");
        }
    }

    /* JADX INFO: renamed from: nh.p$b */
    public static final class b extends AbstractC7789p {

        /* JADX INFO: renamed from: e */
        public final int f42805e;

        /* JADX INFO: renamed from: f */
        public final String f42806f;

        /* JADX INFO: renamed from: g */
        public final String f42807g;

        /* JADX INFO: renamed from: h */
        public final boolean f42808h;

        /* JADX INFO: renamed from: i */
        public final int f42809i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, String str, String str2, boolean z10) {
            super(str, str2, z10, i10);
            C5207g.m11111f(str, "selectionText");
            C5207g.m11111f(str2, "selectionValue");
            this.f42805e = i10;
            this.f42806f = str;
            this.f42807g = str2;
            this.f42808h = z10;
            this.f42809i = i11;
        }

        public /* synthetic */ b(int i10, String str, String str2, boolean z10) {
            this(i10, 0, str, str2, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f42805e == bVar.f42805e && C5207g.m11106a(this.f42806f, bVar.f42806f) && C5207g.m11106a(this.f42807g, bVar.f42807g) && this.f42808h == bVar.f42808h && this.f42809i == bVar.f42809i) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f42807g, C0166e.m758d(this.f42806f, Integer.hashCode(this.f42805e) * 31, 31), 31);
            boolean z10 = this.f42808h;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Integer.hashCode(this.f42809i) + ((iM758d + r10) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Selection(selectionKey=");
            sb2.append(this.f42805e);
            sb2.append(", selectionText=");
            sb2.append(this.f42806f);
            sb2.append(", selectionValue=");
            sb2.append(this.f42807g);
            sb2.append(", selectionIsSelected=");
            sb2.append(this.f42808h);
            sb2.append(", idText=");
            return C0166e.m768o(sb2, this.f42809i, ")");
        }
    }

    /* JADX INFO: renamed from: nh.p$c */
    public static final class c extends AbstractC7789p {

        /* JADX INFO: renamed from: e */
        public final int f42810e;

        /* JADX INFO: renamed from: f */
        public final int f42811f;

        /* JADX INFO: renamed from: g */
        public final boolean f42812g;

        public c(int i10, int i11, boolean z10) {
            super("", "", z10, i10);
            this.f42810e = i10;
            this.f42811f = i11;
            this.f42812g = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f42810e == cVar.f42810e && this.f42811f == cVar.f42811f && this.f42812g == cVar.f42812g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f42811f, Integer.hashCode(this.f42810e) * 31, 31);
            boolean z10 = this.f42812g;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM16d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Switch(selectionKey=");
            sb2.append(this.f42810e);
            sb2.append(", idText=");
            sb2.append(this.f42811f);
            sb2.append(", isChecked=");
            return C0166e.m769p(sb2, this.f42812g, ")");
        }
    }

    /* JADX INFO: renamed from: nh.p$d */
    public static final class d extends AbstractC7789p {

        /* JADX INFO: renamed from: e */
        public final int f42813e;

        public d(int i10) {
            super("", "", false, -1);
            this.f42813e = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f42813e == ((d) obj).f42813e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42813e);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("Title(idText="), this.f42813e, ")");
        }
    }

    /* JADX INFO: renamed from: nh.p$e */
    public static final class e extends AbstractC7789p {

        /* JADX INFO: renamed from: e */
        public final int f42814e;

        /* JADX INFO: renamed from: f */
        public final String f42815f;

        /* JADX INFO: renamed from: g */
        public final boolean f42816g;

        /* JADX INFO: renamed from: h */
        public final FeedTopic f42817h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, String str, boolean z10, FeedTopic feedTopic) {
            super("", str, z10, i10);
            C5207g.m11111f(str, "selectionValue");
            C5207g.m11111f(feedTopic, "topic");
            this.f42814e = i10;
            this.f42815f = str;
            this.f42816g = z10;
            this.f42817h = feedTopic;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f42814e == eVar.f42814e && C5207g.m11106a(this.f42815f, eVar.f42815f) && this.f42816g == eVar.f42816g && this.f42817h == eVar.f42817h) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f42815f, Integer.hashCode(this.f42814e) * 31, 31);
            boolean z10 = this.f42816g;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f42817h.hashCode() + ((iM758d + r10) * 31);
        }

        public final String toString() {
            return "TopicSelection(selectionKey=" + this.f42814e + ", selectionValue=" + this.f42815f + ", selectionIsSelected=" + this.f42816g + ", topic=" + this.f42817h + ")";
        }
    }

    public AbstractC7789p(String str, String str2, boolean z10, int i10) {
        this.f42796a = i10;
        this.f42797b = str;
        this.f42798c = str2;
        this.f42799d = z10;
    }
}
