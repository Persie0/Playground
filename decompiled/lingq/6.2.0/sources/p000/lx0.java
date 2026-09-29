package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50235a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f50236b;

    public /* synthetic */ lx0(Context context, int i) {
        this.f50235a = i;
        this.f50236b = context;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f50235a;
        Context context = this.f50236b;
        switch (i) {
            case 0:
                return context.getString(((Integer) obj).intValue());
            default:
                String str = (String) obj;
                str.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.PROCESS_TEXT", str);
                    intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
                    context.startActivity(Intent.createChooser(intent, null));
                    break;
                } catch (Exception unused) {
                }
                return xfa.f68157a;
        }
    }
}
