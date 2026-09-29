package p232l2;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import p007a6.C0024c;
import p007a6.C0026e;

/* JADX INFO: renamed from: l2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7242u {

    /* JADX INFO: renamed from: a */
    public final CharSequence f40674a;

    /* JADX INFO: renamed from: b */
    public final IconCompat f40675b;

    /* JADX INFO: renamed from: c */
    public final String f40676c;

    /* JADX INFO: renamed from: d */
    public final String f40677d;

    /* JADX INFO: renamed from: e */
    public final boolean f40678e;

    /* JADX INFO: renamed from: f */
    public final boolean f40679f;

    /* JADX INFO: renamed from: l2.u$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static C7242u m14585a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f40680a = person.getName();
            IconCompat iconCompatM2962a = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f5581k;
                icon.getClass();
                int iM2968c = IconCompat.C0778a.m2968c(icon);
                if (iM2968c != 2) {
                    if (iM2968c == 4) {
                        Uri uriM2969d = IconCompat.C0778a.m2969d(icon);
                        uriM2969d.getClass();
                        String string = uriM2969d.toString();
                        string.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f5583b = string;
                    } else if (iM2968c != 6) {
                        iconCompatM2962a = new IconCompat(-1);
                        iconCompatM2962a.f5583b = icon;
                    } else {
                        Uri uriM2969d2 = IconCompat.C0778a.m2969d(icon);
                        uriM2969d2.getClass();
                        String string2 = uriM2969d2.toString();
                        string2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f5583b = string2;
                    }
                    iconCompatM2962a = iconCompat;
                } else {
                    iconCompatM2962a = IconCompat.m2962a(null, IconCompat.C0778a.m2967b(icon), IconCompat.C0778a.m2966a(icon));
                }
            }
            bVar.f40681b = iconCompatM2962a;
            bVar.f40682c = person.getUri();
            bVar.f40683d = person.getKey();
            bVar.f40684e = person.isBot();
            bVar.f40685f = person.isImportant();
            return new C7242u(bVar);
        }

        /* JADX INFO: renamed from: b */
        public static Person m14586b(C7242u c7242u) {
            C0024c.m93r();
            Person.Builder name = C0026e.m135f().setName(c7242u.f40674a);
            IconCompat iconCompat = c7242u.f40675b;
            return name.setIcon(iconCompat != null ? IconCompat.C0778a.m2971f(iconCompat, null) : null).setUri(c7242u.f40676c).setKey(c7242u.f40677d).setBot(c7242u.f40678e).setImportant(c7242u.f40679f).build();
        }
    }

    /* JADX INFO: renamed from: l2.u$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public CharSequence f40680a;

        /* JADX INFO: renamed from: b */
        public IconCompat f40681b;

        /* JADX INFO: renamed from: c */
        public String f40682c;

        /* JADX INFO: renamed from: d */
        public String f40683d;

        /* JADX INFO: renamed from: e */
        public boolean f40684e;

        /* JADX INFO: renamed from: f */
        public boolean f40685f;
    }

    public C7242u(b bVar) {
        this.f40674a = bVar.f40680a;
        this.f40675b = bVar.f40681b;
        this.f40676c = bVar.f40682c;
        this.f40677d = bVar.f40683d;
        this.f40678e = bVar.f40684e;
        this.f40679f = bVar.f40685f;
    }
}
