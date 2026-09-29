package p408u6;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.inbox.C2246a;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.linguist.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p171i6.C6202g;
import p290o6.C7979r0;

/* JADX INFO: renamed from: u6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9474m extends C9467f {

    /* JADX INFO: renamed from: J */
    public final Button f48573J;

    /* JADX INFO: renamed from: K */
    public final Button f48574K;

    /* JADX INFO: renamed from: L */
    public final Button f48575L;

    /* JADX INFO: renamed from: M */
    public final TextView f48576M;

    /* JADX INFO: renamed from: N */
    public final TextView f48577N;

    /* JADX INFO: renamed from: O */
    public final TextView f48578O;

    public C9474m(View view) {
        super(view);
        view.setTag(this);
        this.f48578O = (TextView) view.findViewById(R.id.messageTitle);
        this.f48576M = (TextView) view.findViewById(R.id.messageText);
        this.f48577N = (TextView) view.findViewById(R.id.timestamp);
        this.f48573J = (Button) view.findViewById(R.id.cta_button_1);
        this.f48574K = (Button) view.findViewById(R.id.cta_button_2);
        this.f48575L = (Button) view.findViewById(R.id.cta_button_3);
        this.f48534y = (ImageView) view.findViewById(R.id.media_image);
        this.f48533x = (FrameLayout) view.findViewById(R.id.simple_message_frame_layout);
        this.f48535z = (ImageView) view.findViewById(R.id.square_media_image);
        this.f48523C = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.f48531v = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.f48532w = (LinearLayout) view.findViewById(R.id.body_linear_layout);
        this.f48522B = (FrameLayout) view.findViewById(R.id.simple_progress_frame_layout);
        this.f48521A = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x02a7  */
    @Override // p408u6.C9467f
    /* JADX INFO: renamed from: t */
    public final void mo17876t(CTInboxMessage cTInboxMessage, C2246a c2246a, int i10) {
        int i11;
        int iRound;
        int i12;
        byte b10;
        super.mo17876t(cTInboxMessage, c2246a, i10);
        String str = cTInboxMessage.f11271H;
        C2246a c2246a2 = this.f48527G.get();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.f11285j.get(0);
        String str2 = cTInboxMessageContent.f11298k;
        TextView textView = this.f48578O;
        textView.setText(str2);
        textView.setTextColor(Color.parseColor(cTInboxMessageContent.f11299l));
        String str3 = cTInboxMessageContent.f11295h;
        TextView textView2 = this.f48576M;
        textView2.setText(str3);
        textView2.setTextColor(Color.parseColor(cTInboxMessageContent.f11296i));
        LinearLayout linearLayout = this.f48532w;
        String str4 = cTInboxMessage.f11277b;
        linearLayout.setBackgroundColor(Color.parseColor(str4));
        String strM17880s = C9467f.m17880s(cTInboxMessage.f11282g);
        TextView textView3 = this.f48577N;
        textView3.setText(strM17880s);
        textView3.setTextColor(Color.parseColor(cTInboxMessageContent.f11299l));
        boolean z10 = cTInboxMessage.f11286k;
        ImageView imageView = this.f48529I;
        if (z10) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f48533x.setVisibility(8);
        JSONArray jSONArray = cTInboxMessageContent.f11293f;
        if (jSONArray != null) {
            this.f48531v.setVisibility(0);
            int length = jSONArray.length();
            Button button = this.f48575L;
            Button button2 = this.f48574K;
            Button button3 = this.f48573J;
            try {
                if (length == 1) {
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    button3.setVisibility(0);
                    button3.setText(CTInboxMessageContent.m6546c(jSONObject));
                    button3.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject)));
                    button3.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject)));
                    C9467f.m17882v(button3, button2, button);
                    if (c2246a2 != null) {
                        button3.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button3.getText().toString(), jSONObject, c2246a2, false));
                    }
                } else if (length != 2) {
                    if (length == 3) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        button3.setVisibility(0);
                        try {
                            button3.setText(CTInboxMessageContent.m6546c(jSONObject2));
                            button3.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject2)));
                            button3.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject2)));
                            JSONObject jSONObject3 = jSONArray.getJSONObject(1);
                            button2.setVisibility(0);
                            button2.setText(CTInboxMessageContent.m6546c(jSONObject3));
                            button2.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject3)));
                            button2.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject3)));
                            JSONObject jSONObject4 = jSONArray.getJSONObject(2);
                            button.setVisibility(0);
                            button.setText(CTInboxMessageContent.m6546c(jSONObject4));
                            button.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject4)));
                            button.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject4)));
                            if (c2246a2 != null) {
                                button3.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button3.getText().toString(), jSONObject2, c2246a2, false));
                                button2.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button2.getText().toString(), jSONObject3, c2246a2, false));
                                button.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button.getText().toString(), jSONObject4, c2246a2, false));
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            C2181a.m6449a("Error parsing CTA JSON - " + e.getLocalizedMessage());
                        }
                    }
                    i11 = 8;
                } else {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(0);
                    button3.setVisibility(0);
                    button3.setText(CTInboxMessageContent.m6546c(jSONObject5));
                    button3.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject5)));
                    button3.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject5)));
                    JSONObject jSONObject6 = jSONArray.getJSONObject(1);
                    button2.setVisibility(0);
                    button2.setText(CTInboxMessageContent.m6546c(jSONObject6));
                    button2.setTextColor(Color.parseColor(CTInboxMessageContent.m6545b(jSONObject6)));
                    button2.setBackgroundColor(Color.parseColor(CTInboxMessageContent.m6544a(jSONObject6)));
                    C9467f.m17881u(button3, button2, button);
                    if (c2246a2 != null) {
                        button3.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button3.getText().toString(), jSONObject5, c2246a2, false));
                        button2.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, button2.getText().toString(), jSONObject6, c2246a2, false));
                    }
                }
            } catch (JSONException e11) {
                e = e11;
            }
            i11 = 8;
        } else {
            i11 = 8;
            this.f48531v.setVisibility(8);
        }
        this.f48534y.setVisibility(i11);
        this.f48534y.setBackgroundColor(Color.parseColor(str4));
        this.f48535z.setVisibility(i11);
        this.f48535z.setBackgroundColor(Color.parseColor(str4));
        this.f48521A.setVisibility(i11);
        this.f48522B.setVisibility(i11);
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 108) {
                if (iHashCode == 112 && str.equals("p")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("l")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                if (b10 == 1) {
                    if (cTInboxMessageContent.m6552l()) {
                        this.f48521A.setVisibility(0);
                        this.f48535z.setVisibility(0);
                        this.f48535z.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6259o(cTInboxMessageContent.f11294g).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_image")).m12719g(C7979r0.m15842i(this.f48530u, "ct_image"))).m6245E(this.f48535z);
                        } catch (NoSuchMethodError unused) {
                            C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6259o(cTInboxMessageContent.f11294g).m6245E(this.f48535z);
                        }
                    } else if (cTInboxMessageContent.m6551k()) {
                        this.f48521A.setVisibility(0);
                        this.f48535z.setVisibility(0);
                        this.f48535z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6255d().m6247G(cTInboxMessageContent.f11294g).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_image")).m12719g(C7979r0.m15842i(this.f48530u, "ct_image"))).m6245E(this.f48535z);
                        } catch (NoSuchMethodError unused2) {
                            C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6255d().m6247G(cTInboxMessageContent.f11294g).m6245E(this.f48535z);
                        }
                    } else if (cTInboxMessageContent.m6553n()) {
                        if (cTInboxMessageContent.f11297j.isEmpty()) {
                            this.f48521A.setVisibility(0);
                            this.f48535z.setVisibility(0);
                            if (CTInboxActivity.f11259b0 == 2) {
                                this.f48535z.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                this.f48535z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            int iM15842i = C7979r0.m15842i(this.f48530u, "ct_video_1");
                            if (iM15842i != -1) {
                                ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6258n(Integer.valueOf(iM15842i)).m6245E(this.f48535z);
                            }
                        } else {
                            this.f48521A.setVisibility(0);
                            this.f48535z.setVisibility(0);
                            if (CTInboxActivity.f11259b0 == 2) {
                                this.f48535z.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                this.f48535z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            try {
                                ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6259o(cTInboxMessageContent.f11297j).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_video_1")).m12719g(C7979r0.m15842i(this.f48530u, "ct_video_1"))).m6245E(this.f48535z);
                            } catch (NoSuchMethodError unused3) {
                                C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6259o(cTInboxMessageContent.f11297j).m6245E(this.f48535z);
                            }
                        }
                    } else if (cTInboxMessageContent.m6550j()) {
                        this.f48521A.setVisibility(0);
                        this.f48535z.setVisibility(0);
                        this.f48535z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f48535z.setBackgroundColor(0);
                        int iM15842i2 = C7979r0.m15842i(this.f48530u, "ct_audio");
                        if (iM15842i2 != -1) {
                            ComponentCallbacks2C2080b.m6238e(this.f48535z.getContext()).m6258n(Integer.valueOf(iM15842i2)).m6245E(this.f48535z);
                        }
                    }
                }
            } else if (cTInboxMessageContent.m6552l()) {
                this.f48521A.setVisibility(0);
                this.f48534y.setVisibility(0);
                this.f48534y.setScaleType(ImageView.ScaleType.CENTER_CROP);
                try {
                    ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6259o(cTInboxMessageContent.f11294g).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_image")).m12719g(C7979r0.m15842i(this.f48530u, "ct_image"))).m6245E(this.f48534y);
                } catch (NoSuchMethodError unused4) {
                    C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                    ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6259o(cTInboxMessageContent.f11294g).m6245E(this.f48534y);
                }
            } else if (cTInboxMessageContent.m6551k()) {
                this.f48521A.setVisibility(0);
                this.f48534y.setVisibility(0);
                this.f48534y.setScaleType(ImageView.ScaleType.FIT_CENTER);
                try {
                    ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6255d().m6247G(cTInboxMessageContent.f11294g).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_image")).m12719g(C7979r0.m15842i(this.f48530u, "ct_image"))).m6245E(this.f48534y);
                } catch (NoSuchMethodError unused5) {
                    C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                    ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6255d().m6247G(cTInboxMessageContent.f11294g).m6245E(this.f48534y);
                }
            } else if (cTInboxMessageContent.m6553n()) {
                if (cTInboxMessageContent.f11297j.isEmpty()) {
                    this.f48521A.setVisibility(0);
                    this.f48534y.setVisibility(0);
                    this.f48534y.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    int iM15842i3 = C7979r0.m15842i(this.f48530u, "ct_video_1");
                    if (iM15842i3 != -1) {
                        ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6258n(Integer.valueOf(iM15842i3)).m6245E(this.f48534y);
                    }
                } else {
                    this.f48521A.setVisibility(0);
                    this.f48534y.setVisibility(0);
                    this.f48534y.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6259o(cTInboxMessageContent.f11297j).m6242A(new C6202g().m12722k(C7979r0.m15842i(this.f48530u, "ct_video_1")).m12719g(C7979r0.m15842i(this.f48530u, "ct_video_1"))).m6245E(this.f48534y);
                    } catch (NoSuchMethodError unused6) {
                        C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6259o(cTInboxMessageContent.f11297j).m6245E(this.f48534y);
                    }
                }
            } else if (cTInboxMessageContent.m6550j()) {
                this.f48521A.setVisibility(0);
                this.f48534y.setVisibility(0);
                this.f48534y.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f48534y.setBackgroundColor(0);
                int iM15842i4 = C7979r0.m15842i(this.f48530u, "ct_audio");
                if (iM15842i4 != -1) {
                    ComponentCallbacks2C2080b.m6238e(this.f48534y.getContext()).m6258n(Integer.valueOf(iM15842i4)).m6245E(this.f48534y);
                }
            }
        } catch (NoClassDefFoundError unused7) {
            C2181a.m6449a("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        Resources resources = this.f48530u.getResources();
        if (CTInboxActivity.f11259b0 == 2) {
            iRound = resources.getDisplayMetrics().heightPixels / 2;
            i12 = resources.getDisplayMetrics().widthPixels / 2;
        } else {
            iRound = resources.getDisplayMetrics().widthPixels;
            if (str.equalsIgnoreCase("l")) {
                iRound = Math.round(iRound * 0.5625f);
                i12 = iRound;
            } else {
                i12 = iRound;
            }
        }
        this.f48522B.setLayoutParams(new RelativeLayout.LayoutParams(i12, iRound));
        m17884w(cTInboxMessage, i10);
        if (c2246a2 != null) {
            this.f48523C.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, null, null, c2246a2, true));
        }
    }
}
