package p000;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvg implements kvn, kvl {

    /* JADX INFO: renamed from: a */
    private final kvf f37345a;

    /* JADX INFO: renamed from: b */
    private final Context f37346b;

    /* JADX INFO: renamed from: c */
    private final lpe f37347c;

    public kvg(lpe lpeVar, kvf kvfVar, Context context, byte[] bArr, byte[] bArr2) {
        this.f37347c = lpeVar;
        this.f37345a = kvfVar;
        this.f37346b = context;
    }

    @Override // p000.kvl
    /* JADX INFO: renamed from: a */
    public final Intent mo14930a() {
        Intent intent = new Intent("android.intent.action.INSERT");
        this.f37346b.grantUriPermission("com.google.android.calendar", CalendarContract.Events.CONTENT_URI, 1);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        if (this.f37345a.f37335b.equals(kve.BARHOPPER) && this.f37345a.f37337d.mo16813g()) {
            kxc kxcVar = (kxc) this.f37345a.f37337d.mo16809c();
            if (kxcVar.f37616f == null || kxcVar.f37617g == null) {
                intent.putExtra("allDay", true);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                kxb kxbVar = kxcVar.f37616f;
                if (kxbVar == null) {
                    kxbVar = kxb.f37600h;
                }
                int i = kxbVar.f37602a;
                kxb kxbVar2 = kxcVar.f37616f;
                int i2 = (kxbVar2 == null ? kxb.f37600h : kxbVar2).f37603b - 1;
                int i3 = (kxbVar2 == null ? kxb.f37600h : kxbVar2).f37604c;
                int i4 = (kxbVar2 == null ? kxb.f37600h : kxbVar2).f37605d;
                int i5 = (kxbVar2 == null ? kxb.f37600h : kxbVar2).f37606e;
                if (kxbVar2 == null) {
                    kxbVar2 = kxb.f37600h;
                }
                calendar.set(i, i2, i3, i4, i5, kxbVar2.f37607f);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.clear();
                kxb kxbVar3 = kxcVar.f37617g;
                int i6 = (kxbVar3 == null ? kxb.f37600h : kxbVar3).f37602a;
                int i7 = (kxbVar3 == null ? kxb.f37600h : kxbVar3).f37603b - 1;
                int i8 = (kxbVar3 == null ? kxb.f37600h : kxbVar3).f37604c;
                int i9 = (kxbVar3 == null ? kxb.f37600h : kxbVar3).f37605d;
                int i10 = (kxbVar3 == null ? kxb.f37600h : kxbVar3).f37606e;
                if (kxbVar3 == null) {
                    kxbVar3 = kxb.f37600h;
                }
                calendar2.set(i6, i7, i8, i9, i10, kxbVar3.f37607f);
                if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar2.get(11) == 23 && calendar2.get(12) == 59) {
                    intent.putExtra("allDay", true);
                }
                intent.putExtra("beginTime", calendar.getTimeInMillis()).putExtra("endTime", calendar2.getTimeInMillis());
            }
            if (!kxcVar.f37611a.isEmpty()) {
                intent.putExtra("title", kxcVar.f37611a);
            }
            if (!kxcVar.f37612b.isEmpty()) {
                intent.putExtra("description", kxcVar.f37612b);
            }
            if (!kxcVar.f37613c.isEmpty()) {
                intent.putExtra("eventLocation", kxcVar.f37613c);
            }
            if (!kxcVar.f37615e.isEmpty()) {
                intent.putExtra("availability", kxcVar.f37615e);
            }
        } else {
            lvd.f39383a.m16089c(this, "Unable to convert date object", new Object[0]);
        }
        return intent;
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        this.f37347c.m15812k(mo14930a());
    }
}
