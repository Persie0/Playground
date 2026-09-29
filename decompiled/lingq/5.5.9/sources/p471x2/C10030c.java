package p471x2;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.compose.p017ui.platform.C0682z0;
import java.util.Locale;
import p003a2.C0009a;
import p150h9.C5939v;

/* JADX INFO: renamed from: x2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10030c {

    /* JADX INFO: renamed from: a */
    public final e f51012a;

    /* JADX INFO: renamed from: x2.c$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final ContentInfo.Builder f51013a;

        public a(ClipData clipData, int i10) {
            C5939v.m12373z();
            this.f51013a = C0682z0.m2513i(clipData, i10);
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: a */
        public final C10030c mo18779a() {
            return new C10030c(new d(this.f51013a.build()));
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: b */
        public final void mo18780b(Bundle bundle) {
            this.f51013a.setExtras(bundle);
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: c */
        public final void mo18781c(Uri uri) {
            this.f51013a.setLinkUri(uri);
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: d */
        public final void mo18782d(int i10) {
            this.f51013a.setFlags(i10);
        }
    }

    /* JADX INFO: renamed from: x2.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C10030c mo18779a();

        /* JADX INFO: renamed from: b */
        void mo18780b(Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo18781c(Uri uri);

        /* JADX INFO: renamed from: d */
        void mo18782d(int i10);
    }

    /* JADX INFO: renamed from: x2.c$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final ClipData f51014a;

        /* JADX INFO: renamed from: b */
        public final int f51015b;

        /* JADX INFO: renamed from: c */
        public int f51016c;

        /* JADX INFO: renamed from: d */
        public Uri f51017d;

        /* JADX INFO: renamed from: e */
        public Bundle f51018e;

        public c(ClipData clipData, int i10) {
            this.f51014a = clipData;
            this.f51015b = i10;
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: a */
        public final C10030c mo18779a() {
            return new C10030c(new f(this));
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: b */
        public final void mo18780b(Bundle bundle) {
            this.f51018e = bundle;
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: c */
        public final void mo18781c(Uri uri) {
            this.f51017d = uri;
        }

        @Override // p471x2.C10030c.b
        /* JADX INFO: renamed from: d */
        public final void mo18782d(int i10) {
            this.f51016c = i10;
        }
    }

    /* JADX INFO: renamed from: x2.c$d */
    public static final class d implements e {

        /* JADX INFO: renamed from: a */
        public final ContentInfo f51019a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f51019a = C5939v.m12355h(contentInfo);
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: a */
        public final ClipData mo18783a() {
            return this.f51019a.getClip();
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: b */
        public final ContentInfo mo18784b() {
            return this.f51019a;
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: i */
        public final int mo18785i() {
            return this.f51019a.getFlags();
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: j */
        public final int mo18786j() {
            return this.f51019a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f51019a + "}";
        }
    }

    /* JADX INFO: renamed from: x2.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        ClipData mo18783a();

        /* JADX INFO: renamed from: b */
        ContentInfo mo18784b();

        /* JADX INFO: renamed from: i */
        int mo18785i();

        /* JADX INFO: renamed from: j */
        int mo18786j();
    }

    /* JADX INFO: renamed from: x2.c$f */
    public static final class f implements e {

        /* JADX INFO: renamed from: a */
        public final ClipData f51020a;

        /* JADX INFO: renamed from: b */
        public final int f51021b;

        /* JADX INFO: renamed from: c */
        public final int f51022c;

        /* JADX INFO: renamed from: d */
        public final Uri f51023d;

        /* JADX INFO: renamed from: e */
        public final Bundle f51024e;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public f(c cVar) {
            ClipData clipData = cVar.f51014a;
            clipData.getClass();
            this.f51020a = clipData;
            int i10 = cVar.f51015b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i10 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f51021b = i10;
            int i11 = cVar.f51016c;
            if ((i11 & 1) == i11) {
                this.f51022c = i11;
                this.f51023d = cVar.f51017d;
                this.f51024e = cVar.f51018e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: a */
        public final ClipData mo18783a() {
            return this.f51020a;
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: b */
        public final ContentInfo mo18784b() {
            return null;
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: i */
        public final int mo18785i() {
            return this.f51022c;
        }

        @Override // p471x2.C10030c.e
        /* JADX INFO: renamed from: j */
        public final int mo18786j() {
            return this.f51021b;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f51020a.getDescription());
            sb2.append(", source=");
            int i10 = this.f51021b;
            if (i10 == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i10 == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i10 != 4) {
                strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb2.append(strValueOf);
            sb2.append(", flags=");
            int i11 = this.f51022c;
            sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            Uri uri = this.f51023d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return C0009a.m23l(sb2, this.f51024e != null ? ", hasExtras" : "", "}");
        }
    }

    public C10030c(e eVar) {
        this.f51012a = eVar;
    }

    public final String toString() {
        return this.f51012a.toString();
    }
}
