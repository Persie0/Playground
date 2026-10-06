package p000;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iyu implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f32684a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32685b;

    public /* synthetic */ iyu(Context context, int i) {
        this.f32685b = i;
        this.f32684a = context;
    }

    public /* synthetic */ iyu(iyv iyvVar, int i) {
        this.f32685b = i;
        this.f32684a = iyvVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String string;
        switch (this.f32685b) {
            case 0:
                iyv iyvVar = (iyv) this.f32684a;
                if (iyvVar.f32686a) {
                    iyvVar.f32687b = true;
                    iyvVar.m11911b();
                }
                return true;
            case 1:
                Context context = (Context) this.f32684a;
                long jM10102b = hcf.m10102b(context);
                if (jM10102b == -1) {
                    return false;
                }
                if (jM10102b != hcf.m10101a(context, 2097152)) {
                    string = "<b>" + jM10102b + "</b>";
                } else {
                    string = Long.toString(jM10102b);
                }
                Toast.makeText(context, Html.fromHtml(context.getString(C0100R.string.camera_hal_version_message, string), 63), 1).show();
                return true;
            default:
                iyv iyvVar2 = (iyv) this.f32684a;
                if (iyvVar2.f32686a) {
                    iyvVar2.f32688c = true;
                    iyvVar2.m11911b();
                }
                return true;
        }
    }
}
