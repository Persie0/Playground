package p000;

import android.os.Bundle;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import java.util.Arrays;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class yv0 implements wv0 {

    /* JADX INFO: renamed from: a */
    public final hm5 f70527a;

    /* JADX INFO: renamed from: b */
    public String f70528b;

    /* JADX INFO: renamed from: c */
    public String f70529c;

    /* JADX INFO: renamed from: d */
    public Integer f70530d;

    /* JADX INFO: renamed from: e */
    public int f70531e;

    /* JADX INFO: renamed from: f */
    public int f70532f;

    /* JADX INFO: renamed from: g */
    public int f70533g;

    /* JADX INFO: renamed from: h */
    public int f70534h;

    /* JADX INFO: renamed from: i */
    public int f70535i;

    /* JADX INFO: renamed from: j */
    public int[] f70536j;

    /* JADX INFO: renamed from: k */
    public int f70537k;

    /* JADX INFO: renamed from: l */
    public int f70538l;

    /* JADX INFO: renamed from: m */
    public int f70539m;

    /* JADX INFO: renamed from: n */
    public int f70540n;

    /* JADX INFO: renamed from: o */
    public DateTime f70541o;

    public yv0(hm5 hm5Var, un1 un1Var, nn1 nn1Var) {
        hm5Var.getClass();
        un1Var.getClass();
        this.f70527a = hm5Var;
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: a1 */
    public final void mo8922a1(ChatEngagedDataType chatEngagedDataType, Integer num) {
        chatEngagedDataType.getClass();
        switch (xv0.f68838a[chatEngagedDataType.ordinal()]) {
            case 1:
                this.f70531e = num.intValue() + this.f70531e;
                break;
            case 2:
                this.f70532f = num.intValue();
                break;
            case 3:
                this.f70533g = num.intValue() + this.f70533g;
                break;
            case 4:
                this.f70534h = num.intValue() + this.f70534h;
                break;
            case 5:
                this.f70535i = num.intValue() + this.f70535i;
                break;
            case 6:
                int[] iArr = this.f70536j;
                if (iArr != null) {
                    int iIntValue = num.intValue();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = iIntValue;
                    this.f70536j = iArrCopyOf;
                } else {
                    this.f70536j = new int[]{num.intValue()};
                }
                break;
            case 7:
                this.f70537k = num.intValue() + this.f70537k;
                break;
            case 8:
                this.f70538l = num.intValue() + this.f70538l;
                break;
            case 9:
                this.f70539m = num.intValue() + this.f70539m;
                break;
            case 10:
                this.f70540n = num.intValue() + this.f70540n;
                break;
            default:
                gm5.m12750e();
                break;
        }
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: b */
    public final void mo8924b(DateTime dateTime) {
        this.f70541o = dateTime;
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: e */
    public final void mo8928e(String str, int i, String str2) {
        this.f70528b = str;
        this.f70529c = str2;
        this.f70530d = Integer.valueOf(i);
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: h2 */
    public final void mo8929h2() {
        String str = this.f70528b;
        String str2 = this.f70529c;
        Integer num = this.f70530d;
        if (str != null && str2 != null && num != null && this.f70541o != null) {
            Bundle bundle = new Bundle();
            bundle.putString("chat language", str);
            bundle.putString("dictionary language", str2);
            bundle.putInt("chat id", num.intValue());
            bundle.putInt("blue words clicked", this.f70531e);
            bundle.putInt("coins earned", this.f70532f);
            bundle.putInt("known words added", this.f70533g);
            bundle.putInt("known words clicked", this.f70534h);
            bundle.putInt("lingqs created", this.f70535i);
            bundle.putIntArray("nth lingqs created", this.f70536j);
            bundle.putInt("words read", this.f70537k);
            bundle.putInt("words written", this.f70538l);
            DateTime dateTime = this.f70541o;
            bundle.putInt("time in chat", dateTime != null ? ((int) (new DateTime().mo18366b() - dateTime.mo18366b())) / DescriptorProtos.Edition.EDITION_2023_VALUE : 0);
            bundle.putInt("time spent listening", this.f70539m);
            bundle.putInt("number of user responses", this.f70540n);
            ((C1240a) this.f70527a).m7025f("chat engaged", bundle);
            sm5.Companion.getClass();
            h0a.f41641a.mo11430a("Chat engaged event sent for chat " + num, new Object[0]);
        }
        mo8930n2();
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: n2 */
    public final void mo8930n2() {
        this.f70528b = null;
        this.f70529c = null;
        this.f70530d = null;
        this.f70531e = 0;
        this.f70532f = 0;
        this.f70533g = 0;
        this.f70534h = 0;
        this.f70535i = 0;
        this.f70536j = null;
        this.f70537k = 0;
        this.f70538l = 0;
        this.f70539m = 0;
        this.f70540n = 0;
        this.f70541o = null;
    }
}
