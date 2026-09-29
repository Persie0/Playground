package p462wj;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;
import p264mi.C7566f;

/* JADX INFO: renamed from: wj.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9953a {

    /* JADX INFO: renamed from: wj.a$a */
    public static final class a extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50633a;

        /* JADX INFO: renamed from: b */
        public final String f50634b;

        public a(C7566f c7566f, String str) {
            C5207g.m11111f(str, "correctAnswer");
            this.f50633a = c7566f;
            this.f50634b = str;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50633a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f50633a, aVar.f50633a) && C5207g.m11106a(this.f50634b, aVar.f50634b);
        }

        public final int hashCode() {
            return this.f50634b.hashCode() + (this.f50633a.hashCode() * 31);
        }

        public final String toString() {
            return "ClozeActivity(cardVocabulary=" + this.f50633a + ", correctAnswer=" + this.f50634b + ")";
        }
    }

    /* JADX INFO: renamed from: wj.a$b */
    public static final class b extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50635a;

        /* JADX INFO: renamed from: b */
        public final String f50636b;

        /* JADX INFO: renamed from: c */
        public final List<String> f50637c;

        public b(C7566f c7566f, String str, ArrayList arrayList) {
            C5207g.m11111f(str, "correctAnswer");
            this.f50635a = c7566f;
            this.f50636b = str;
            this.f50637c = arrayList;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50635a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f50635a, bVar.f50635a) && C5207g.m11106a(this.f50636b, bVar.f50636b) && C5207g.m11106a(this.f50637c, bVar.f50637c);
        }

        public final int hashCode() {
            return this.f50637c.hashCode() + C0166e.m758d(this.f50636b, this.f50635a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DictationActivity(cardVocabulary=");
            sb2.append(this.f50635a);
            sb2.append(", correctAnswer=");
            sb2.append(this.f50636b);
            sb2.append(", cards=");
            return C0009a.m24m(sb2, this.f50637c, ")");
        }
    }

    /* JADX INFO: renamed from: wj.a$c */
    public static final class c extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50638a;

        /* JADX INFO: renamed from: b */
        public final String f50639b;

        /* JADX INFO: renamed from: c */
        public final List<String> f50640c;

        public c(C7566f c7566f, String str, ArrayList arrayList) {
            C5207g.m11111f(str, "correctAnswer");
            this.f50638a = c7566f;
            this.f50639b = str;
            this.f50640c = arrayList;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50638a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f50638a, cVar.f50638a) && C5207g.m11106a(this.f50639b, cVar.f50639b) && C5207g.m11106a(this.f50640c, cVar.f50640c);
        }

        public final int hashCode() {
            return this.f50640c.hashCode() + C0166e.m758d(this.f50639b, this.f50638a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DictationReverseActivity(cardVocabulary=");
            sb2.append(this.f50638a);
            sb2.append(", correctAnswer=");
            sb2.append(this.f50639b);
            sb2.append(", meanings=");
            return C0009a.m24m(sb2, this.f50640c, ")");
        }
    }

    /* JADX INFO: renamed from: wj.a$d */
    public static final class d extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50641a;

        public d(C7566f c7566f) {
            C5207g.m11111f(c7566f, "cardVocabulary");
            this.f50641a = c7566f;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50641a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && C5207g.m11106a(this.f50641a, ((d) obj).f50641a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f50641a.hashCode();
        }

        public final String toString() {
            return "FlashcardActivity(cardVocabulary=" + this.f50641a + ")";
        }
    }

    /* JADX INFO: renamed from: wj.a$e */
    public static final class e extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50642a;

        public e(C7566f c7566f) {
            C5207g.m11111f(c7566f, "cardVocabulary");
            this.f50642a = c7566f;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50642a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C5207g.m11106a(this.f50642a, ((e) obj).f50642a);
        }

        public final int hashCode() {
            return this.f50642a.hashCode();
        }

        public final String toString() {
            return "FlashcardReverseActivity(cardVocabulary=" + this.f50642a + ")";
        }
    }

    /* JADX INFO: renamed from: wj.a$f */
    public static final class f extends AbstractC9953a implements InterfaceC9956d {

        /* JADX INFO: renamed from: a */
        public final List<String> f50643a;

        public f(List<String> list) {
            C5207g.m11111f(list, "terms");
            this.f50643a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C5207g.m11106a(this.f50643a, ((f) obj).f50643a);
        }

        public final int hashCode() {
            return this.f50643a.hashCode();
        }

        public final String toString() {
            return "MatchingActivity(terms=" + this.f50643a + ")";
        }
    }

    /* JADX INFO: renamed from: wj.a$g */
    public static final class g extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50644a;

        /* JADX INFO: renamed from: b */
        public final String f50645b;

        /* JADX INFO: renamed from: c */
        public final List<String> f50646c;

        public g(C7566f c7566f, String str, ArrayList arrayList) {
            C5207g.m11111f(str, "correctAnswer");
            this.f50644a = c7566f;
            this.f50645b = str;
            this.f50646c = arrayList;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50644a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C5207g.m11106a(this.f50644a, gVar.f50644a) && C5207g.m11106a(this.f50645b, gVar.f50645b) && C5207g.m11106a(this.f50646c, gVar.f50646c);
        }

        public final int hashCode() {
            return this.f50646c.hashCode() + C0166e.m758d(this.f50645b, this.f50644a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiChoiceActivity(cardVocabulary=");
            sb2.append(this.f50644a);
            sb2.append(", correctAnswer=");
            sb2.append(this.f50645b);
            sb2.append(", meanings=");
            return C0009a.m24m(sb2, this.f50646c, ")");
        }
    }

    /* JADX INFO: renamed from: wj.a$h */
    public static final class h extends AbstractC9953a implements InterfaceC9957e {

        /* JADX INFO: renamed from: a */
        public final C7566f f50647a;

        /* JADX INFO: renamed from: b */
        public final String f50648b;

        /* JADX INFO: renamed from: c */
        public final List<String> f50649c;

        public h(C7566f c7566f, String str, ArrayList arrayList) {
            C5207g.m11111f(str, "correctAnswer");
            this.f50647a = c7566f;
            this.f50648b = str;
            this.f50649c = arrayList;
        }

        @Override // p462wj.InterfaceC9957e
        /* JADX INFO: renamed from: a */
        public final C7566f mo18533a() {
            return this.f50647a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C5207g.m11106a(this.f50647a, hVar.f50647a) && C5207g.m11106a(this.f50648b, hVar.f50648b) && C5207g.m11106a(this.f50649c, hVar.f50649c);
        }

        public final int hashCode() {
            return this.f50649c.hashCode() + C0166e.m758d(this.f50648b, this.f50647a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiChoiceReverseActivity(cardVocabulary=");
            sb2.append(this.f50647a);
            sb2.append(", correctAnswer=");
            sb2.append(this.f50648b);
            sb2.append(", cards=");
            return C0009a.m24m(sb2, this.f50649c, ")");
        }
    }

    /* JADX INFO: renamed from: wj.a$i */
    public static final class i extends AbstractC9953a implements InterfaceC9956d {

        /* JADX INFO: renamed from: a */
        public final int f50650a;

        public i(int i10) {
            this.f50650a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f50650a == ((i) obj).f50650a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f50650a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("SpeakingActivity(sentenceIndex="), this.f50650a, ")");
        }
    }

    /* JADX INFO: renamed from: wj.a$j */
    public static final class j extends AbstractC9953a implements InterfaceC9956d {

        /* JADX INFO: renamed from: a */
        public final int f50651a;

        public j(int i10) {
            this.f50651a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f50651a == ((j) obj).f50651a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f50651a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("UnscrambleActivity(sentenceIndex="), this.f50651a, ")");
        }
    }
}
