package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p255m3.C7475a;
import p312p2.C8171c;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0897k {

    /* JADX INFO: renamed from: a */
    public final C0892f.j f6008a;

    /* JADX INFO: renamed from: b */
    public final C0901o f6009b;

    /* JADX INFO: renamed from: c */
    public final C0892f.e f6010c;

    /* JADX INFO: renamed from: androidx.emoji2.text.k$a */
    public static class a implements b<C0905s> {

        /* JADX INFO: renamed from: a */
        public C0905s f6011a;

        /* JADX INFO: renamed from: b */
        public final C0892f.j f6012b;

        public a(C0905s c0905s, C0892f.j jVar) {
            this.f6011a = c0905s;
            this.f6012b = jVar;
        }

        @Override // androidx.emoji2.text.C0897k.b
        /* JADX INFO: renamed from: a */
        public final C0905s mo3534a() {
            return this.f6011a;
        }

        @Override // androidx.emoji2.text.C0897k.b
        /* JADX INFO: renamed from: b */
        public final boolean mo3535b(CharSequence charSequence, int i10, int i11, C0903q c0903q) {
            if ((c0903q.f6049c & 4) > 0) {
                return true;
            }
            if (this.f6011a == null) {
                this.f6011a = new C0905s(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((C0892f.d) this.f6012b).getClass();
            this.f6011a.setSpan(new C0904r(c0903q), i10, i11, 33);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.k$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        T mo3534a();

        /* JADX INFO: renamed from: b */
        boolean mo3535b(CharSequence charSequence, int i10, int i11, C0903q c0903q);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.k$c */
    public static class c implements b<c> {

        /* JADX INFO: renamed from: a */
        public final String f6013a;

        public c(String str) {
            this.f6013a = str;
        }

        @Override // androidx.emoji2.text.C0897k.b
        /* JADX INFO: renamed from: a */
        public final c mo3534a() {
            return this;
        }

        @Override // androidx.emoji2.text.C0897k.b
        /* JADX INFO: renamed from: b */
        public final boolean mo3535b(CharSequence charSequence, int i10, int i11, C0903q c0903q) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f6013a)) {
                return true;
            }
            c0903q.f6049c = (c0903q.f6049c & 3) | 4;
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.k$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public int f6014a = 1;

        /* JADX INFO: renamed from: b */
        public final C0901o.a f6015b;

        /* JADX INFO: renamed from: c */
        public C0901o.a f6016c;

        /* JADX INFO: renamed from: d */
        public C0901o.a f6017d;

        /* JADX INFO: renamed from: e */
        public int f6018e;

        /* JADX INFO: renamed from: f */
        public int f6019f;

        /* JADX INFO: renamed from: g */
        public final boolean f6020g;

        /* JADX INFO: renamed from: h */
        public final int[] f6021h;

        public d(C0901o.a aVar, boolean z10, int[] iArr) {
            this.f6015b = aVar;
            this.f6016c = aVar;
            this.f6020g = z10;
            this.f6021h = iArr;
        }

        /* JADX INFO: renamed from: a */
        public final void m3536a() {
            this.f6014a = 1;
            this.f6016c = this.f6015b;
            this.f6019f = 0;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3537b() {
            int[] iArr;
            C7475a c7475aM3552c = this.f6016c.f6041b.m3552c();
            int iM14859a = c7475aM3552c.m14859a(6);
            if ((iM14859a == 0 || c7475aM3552c.f41325b.get(iM14859a + c7475aM3552c.f41324a) == 0) ? false : true) {
                return true;
            }
            if (this.f6018e == 65039) {
                return true;
            }
            return this.f6020g && ((iArr = this.f6021h) == null || Arrays.binarySearch(iArr, this.f6016c.f6041b.m3550a(0)) < 0);
        }
    }

    public C0897k(C0901o c0901o, C0892f.d dVar, C0890d c0890d, Set set) {
        this.f6008a = dVar;
        this.f6009b = c0901o;
        this.f6010c = c0890d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m3533c(str, 0, str.length(), 1, true, new c(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3531a(Editable editable, KeyEvent keyEvent, boolean z10) {
        AbstractC0898l[] abstractC0898lArr;
        int i10;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (abstractC0898lArr = (AbstractC0898l[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0898l.class)) != null && abstractC0898lArr.length > 0) {
            for (AbstractC0898l abstractC0898l : abstractC0898lArr) {
                int spanStart = editable.getSpanStart(abstractC0898l);
                int spanEnd = editable.getSpanEnd(abstractC0898l);
                i10 = (!(z10 && spanStart == selectionStart) && (z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd)) ? i10 + 1 : 0;
                editable.delete(spanStart, spanEnd);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3532b(CharSequence charSequence, int i10, int i11, C0903q c0903q) {
        if ((c0903q.f6049c & 3) == 0) {
            C0892f.e eVar = this.f6010c;
            C7475a c7475aM3552c = c0903q.m3552c();
            int iM14859a = c7475aM3552c.m14859a(8);
            if (iM14859a != 0) {
                c7475aM3552c.f41325b.getShort(iM14859a + c7475aM3552c.f41324a);
            }
            C0890d c0890d = (C0890d) eVar;
            c0890d.getClass();
            ThreadLocal<StringBuilder> threadLocal = C0890d.f5980b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = c0890d.f5981a;
            String string = sb2.toString();
            int i12 = C8171c.f44306a;
            boolean zM16222a = C8171c.a.m16222a(textPaint, string);
            int i13 = c0903q.f6049c & 4;
            c0903q.f6049c = zM16222a ? i13 | 2 : i13 | 1;
        }
        return (c0903q.f6049c & 3) == 2;
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m3533c(CharSequence charSequence, int i10, int i11, int i12, boolean z10, b<T> bVar) {
        char c10;
        C0901o.a aVar = null;
        d dVar = new d(this.f6009b.f6038c, false, null);
        int iCharCount = i10;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i13 = 0;
        boolean z11 = true;
        int iCharCount2 = iCharCount;
        while (iCharCount2 < i11 && i13 < i12 && z11) {
            SparseArray<C0901o.a> sparseArray = dVar.f6016c.f6040a;
            C0901o.a aVar2 = sparseArray == null ? aVar : sparseArray.get(iCodePointAt);
            if (dVar.f6014a == 2) {
                if (aVar2 != null) {
                    dVar.f6016c = aVar2;
                    dVar.f6019f++;
                } else {
                    if (iCodePointAt == 65038) {
                        dVar.m3536a();
                    } else {
                        if (!(iCodePointAt == 65039)) {
                            C0901o.a aVar3 = dVar.f6016c;
                            if (aVar3.f6041b != null) {
                                if (dVar.f6019f != 1) {
                                    dVar.f6017d = aVar3;
                                    dVar.m3536a();
                                } else if (dVar.m3537b()) {
                                    dVar.f6017d = dVar.f6016c;
                                    dVar.m3536a();
                                } else {
                                    dVar.m3536a();
                                }
                                c10 = 3;
                            } else {
                                dVar.m3536a();
                            }
                        }
                    }
                    c10 = 1;
                }
                c10 = 2;
            } else if (aVar2 == null) {
                dVar.m3536a();
                c10 = 1;
            } else {
                dVar.f6014a = 2;
                dVar.f6016c = aVar2;
                dVar.f6019f = 1;
                c10 = 2;
            }
            dVar.f6018e = iCodePointAt;
            if (c10 != 1) {
                if (c10 == 2) {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                } else if (c10 == 3) {
                    if (z10 || !m3532b(charSequence, iCharCount, iCharCount2, dVar.f6017d.f6041b)) {
                        boolean zMo3535b = bVar.mo3535b(charSequence, iCharCount, iCharCount2, dVar.f6017d.f6041b);
                        i13++;
                        iCharCount = iCharCount2;
                        z11 = zMo3535b;
                    } else {
                        iCharCount = iCharCount2;
                    }
                }
                aVar = null;
            } else {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                if (iCharCount < i11) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            iCharCount2 = iCharCount;
            aVar = null;
        }
        if ((dVar.f6014a == 2 && dVar.f6016c.f6041b != null && (dVar.f6019f > 1 || dVar.m3537b())) && i13 < i12 && z11 && (z10 || !m3532b(charSequence, iCharCount, iCharCount2, dVar.f6016c.f6041b))) {
            bVar.mo3535b(charSequence, iCharCount, iCharCount2, dVar.f6016c.f6041b);
        }
        return bVar.mo3534a();
    }
}
