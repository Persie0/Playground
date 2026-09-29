package p408u6;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.activity.result.C0204c;
import androidx.fragment.app.ActivityC0979t;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.C2246a;
import com.clevertap.android.sdk.inbox.CTCarouselViewPager;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: u6.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC9468g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final JSONObject f48541a;

    /* JADX INFO: renamed from: b */
    public final String f48542b;

    /* JADX INFO: renamed from: c */
    public final C2246a f48543c;

    /* JADX INFO: renamed from: d */
    public final CTInboxMessage f48544d;

    /* JADX INFO: renamed from: e */
    public final int f48545e;

    /* JADX INFO: renamed from: f */
    public final ViewPager f48546f;

    /* JADX INFO: renamed from: g */
    public final boolean f48547g;

    public ViewOnClickListenerC9468g(int i10, CTInboxMessage cTInboxMessage, C2246a c2246a, CTCarouselViewPager cTCarouselViewPager) {
        this.f48545e = i10;
        this.f48544d = cTInboxMessage;
        this.f48542b = null;
        this.f48543c = c2246a;
        this.f48546f = cTCarouselViewPager;
        this.f48547g = true;
    }

    public ViewOnClickListenerC9468g(int i10, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, C2246a c2246a, boolean z10) {
        this.f48545e = i10;
        this.f48544d = cTInboxMessage;
        this.f48542b = str;
        this.f48543c = c2246a;
        this.f48541a = jSONObject;
        this.f48547g = z10;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JSONObject jSONObject;
        String string;
        int i10 = this.f48545e;
        C2246a c2246a = this.f48543c;
        ViewPager viewPager = this.f48546f;
        if (viewPager != null) {
            if (c2246a != null) {
                c2246a.m6557p0(i10, viewPager.getCurrentItem(), this.f48547g);
                return;
            }
            return;
        }
        String str = this.f48542b;
        HashMap<String, String> map = null;
        if (str == null || (jSONObject = this.f48541a) == null) {
            if (c2246a != null) {
                c2246a.m6556o0(i10, null, null, null);
                return;
            }
            return;
        }
        if (c2246a != null) {
            CTInboxMessage cTInboxMessage = this.f48544d;
            cTInboxMessage.f11285j.get(0).getClass();
            boolean zEqualsIgnoreCase = CTInboxMessageContent.m6548e(jSONObject).equalsIgnoreCase("copy");
            ArrayList<CTInboxMessageContent> arrayList = cTInboxMessage.f11285j;
            if (zEqualsIgnoreCase && c2246a.m3582e() != null) {
                ActivityC0979t activityC0979tM3582e = c2246a.m3582e();
                ClipboardManager clipboardManager = (ClipboardManager) activityC0979tM3582e.getSystemService("clipboard");
                arrayList.get(0).getClass();
                try {
                    JSONObject jSONObject2 = jSONObject.has("copyText") ? jSONObject.getJSONObject("copyText") : null;
                    string = (jSONObject2 == null || !jSONObject2.has("text")) ? "" : jSONObject2.getString("text");
                } catch (JSONException e10) {
                    C0204c.m863w(e10, new StringBuilder("Unable to get Link Text with JSON - "));
                }
                ClipData clipDataNewPlainText = ClipData.newPlainText(str, string);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipDataNewPlainText);
                    Toast.makeText(activityC0979tM3582e, "Text Copied to Clipboard", 0).show();
                }
            }
            if (arrayList != null && arrayList.get(0) != null) {
                arrayList.get(0).getClass();
                if ("kv".equalsIgnoreCase(CTInboxMessageContent.m6548e(jSONObject))) {
                    arrayList.get(0).getClass();
                    if (jSONObject.has("kv")) {
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("kv");
                            Iterator<String> itKeys = jSONObject3.keys();
                            HashMap<String, String> map2 = new HashMap<>();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string2 = jSONObject3.getString(next);
                                if (!TextUtils.isEmpty(next)) {
                                    map2.put(next, string2);
                                }
                            }
                            if (!map2.isEmpty()) {
                                map = map2;
                            }
                        } catch (JSONException e11) {
                            C0204c.m863w(e11, new StringBuilder("Unable to get Link Key Value with JSON - "));
                        }
                    }
                }
            }
            c2246a.m6556o0(i10, str, jSONObject, map);
        }
    }
}
