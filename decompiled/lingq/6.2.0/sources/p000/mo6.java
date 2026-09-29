package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mo6 {

    /* JADX INFO: renamed from: a */
    public final List f51637a;

    public mo6(List list) {
        list.getClass();
        this.f51637a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo6) && fa4.m11650l(this.f51637a, ((mo6) obj).f51637a);
    }

    public final int hashCode() {
        return this.f51637a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("NotificationsSettingsScreenState(settingsItems=", ")", this.f51637a);
    }
}
