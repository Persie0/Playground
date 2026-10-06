package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class jnw extends jij {
    public static final Parcelable.Creator CREATOR = new jny(1);

    /* JADX INFO: renamed from: a */
    LocationRequest f34427a;

    public jnw(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        jms jmsVar;
        int i;
        WorkSource workSource;
        int i2;
        int i3 = locationRequest.f7753a;
        long j2 = locationRequest.f7754b;
        long j3 = locationRequest.f7755c;
        long j4 = locationRequest.f7756d;
        long j5 = locationRequest.f7757e;
        int i4 = locationRequest.f7758f;
        float f = locationRequest.f7759g;
        boolean z5 = locationRequest.f7760h;
        long j6 = locationRequest.f7761i;
        int i5 = locationRequest.f7762j;
        long j7 = j6;
        int i6 = locationRequest.f7763k;
        String str = locationRequest.f7764l;
        boolean z6 = locationRequest.f7765m;
        WorkSource workSource2 = locationRequest.f7766n;
        jms jmsVar2 = locationRequest.f7767o;
        if (list == null) {
            jmsVar = jmsVar2;
            i = i5;
            workSource = workSource2;
        } else if (list.isEmpty()) {
            jmsVar = jmsVar2;
            workSource = null;
            i = i5;
        } else {
            WorkSource workSource3 = new WorkSource();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jms jmsVar3 = jmsVar2;
                jgx jgxVar = (jgx) it.next();
                jix.m13237a(workSource3, jgxVar.f34007a, jgxVar.f34008b);
                jmsVar2 = jmsVar3;
                i5 = i5;
            }
            jmsVar = jmsVar2;
            i = i5;
            workSource = workSource3;
        }
        if (z) {
            jib.m13198c(true, "granularity %d must be a Granularity.GRANULARITY_* constant", 1);
            i = 1;
        }
        if (z2) {
            jib.m13198c(true, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", 2);
            i2 = 2;
        } else {
            i2 = i6;
        }
        boolean z7 = z3 | z6;
        boolean z8 = z4 | z5;
        if (j != Long.MAX_VALUE) {
            boolean z9 = j == -1 || j >= 0;
            jib.m13197b(z9, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            j7 = j;
        }
        this.f34427a = jpd.m13424e(i3, j2, j3, j4, j5, i4, f, z8, j7, i, i2, str, z7, workSource, jmsVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jnw) {
            return jib.m13209n(this.f34427a, ((jnw) obj).f34427a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34427a.hashCode();
    }

    public final String toString() {
        return this.f34427a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 1, this.f34427a, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
