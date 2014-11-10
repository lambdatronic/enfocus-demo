(ns enfocus-demo.core
  (:require [enfocus.core :as ef]
            [enfocus.effects :as eff]
            [enfocus.events :as ev])
  (:require-macros [enfocus.macros :as em]))

(em/defaction change [msg]
  "#button1" (eff/chain
              (eff/fade-out 500)
              (ef/content msg)
              (eff/fade-in 500)))

(em/defaction resize-div [width]
  "#rz-demo" (eff/chain
              (eff/resize width :curheight 500)
              (eff/resize 5 :curheight 500)))

(em/defaction setup []
  "#button1" (ev/listen :click #(change "I have been clicked"))
  "#button2" (ev/listen :click #(resize-div 200)))

(set! (.-onload js/window) setup)
