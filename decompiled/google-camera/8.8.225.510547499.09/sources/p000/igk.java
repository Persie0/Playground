package p000;

import android.content.res.Resources;
import android.database.Cursor;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igk implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f30766a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30767b;

    public /* synthetic */ igk(boolean z, int i) {
        this.f30767b = i;
        this.f30766a = z;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f30767b) {
            case 0:
                boolean z = this.f30766a;
                Resources resources = (Resources) obj;
                igm igmVarM11290a = ign.m11290a();
                igmVarM11290a.m11278o(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11276m(0);
                igmVarM11290a.m11273j(resources.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a.m11277n(resources.getColor(C0100R.color.camera_mode_idle_color, null));
                igmVarM11290a.m11263A(0);
                igmVarM11290a.m11289z(resources.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a.m11284u(0);
                igmVarM11290a.m11282s(resources.getDimensionPixelSize(C0100R.dimen.portrait_button_inner_radius));
                igmVarM11290a.m11279p(z ? resources.getDimensionPixelSize(C0100R.dimen.portrait_wearable_button_inner_ring_radius) : resources.getDimensionPixelSize(C0100R.dimen.portrait_button_inner_ring_radius));
                igmVarM11290a.m11280q(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11283t(resources.getDimensionPixelSize(C0100R.dimen.portrait_button_outer_radius));
                igmVarM11290a.m11275l(resources.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                return igmVarM11290a;
            default:
                boolean z2 = this.f30766a;
                Cursor cursor = (Cursor) obj;
                String[] strArr = dkc.f11869c;
                return dkc.m6286a(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), z2);
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f30767b) {
            case 0:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f30767b) {
            case 0:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
